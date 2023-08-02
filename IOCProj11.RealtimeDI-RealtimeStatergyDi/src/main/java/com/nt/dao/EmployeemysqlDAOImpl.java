package com.nt.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;
	public class EmployeemysqlDAOImpl implements IEmployeeDAO {
		private static final String EMP_INSERT_QUERY="INSERT INTO REALTIMEDI_SPRING_EMPLOYEE(ENAME,DESG,BASICSALERY,GROSSSALERY,NETSALERY)VALUES(?,?,?,?,?)";
	//HAS a property
		private DataSource ds;
		//alt+shift+s,o
		public EmployeemysqlDAOImpl(DataSource ds) {
	System.out.println("EMployeeDAOImpl :1-param constructer");
	this.ds = ds;
		}
		@Override
		public int insertEmployee(EmployeeBO bo) throws Exception{
	int result=0;
			 try(Connection con=ds.getConnection();
					PreparedStatement ps=con.prepareStatement(EMP_INSERT_QUERY);)
			{	//set values to query params
				ps.setString(1,bo.getEname());
				ps.setString(2,bo.getDesg());
				ps.setFloat(3,bo.getBasicSalery());
				ps.setFloat(4, bo.getGrossSalery());
				ps.setFloat(5,bo.getNetSalery());
				//execute the Query
		result=ps.executeUpdate();
				}//try
			catch(SQLException se) {
				se.printStackTrace();
				throw se;//exception throwing
			}
			catch(Exception e) {
				e.printStackTrace();
				throw e;
			}
			return result;
		}
	}
