package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String EMP_INSERT_QUERY="INSERT INTO REALTIMEDI_SPRING_EMPLOYEE  VALUES(SP_ENO_SEQ.NEXTVAL,?,?,?,?,?)";
//HAS a property
	private DataSource ds;
	//alt+shift+s,o
	public EmployeeDAOImpl(DataSource ds) {
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
/*	public int InsertEmployee(EmployeeBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try {
			//get pooled JDBC con object
			con=ds.getConnection();
			//craete preaparedStatement object having query as the pre-complied SQL query
			ps=con.prepareStatement(EMP_INSERT_QUERY);
			//set values to query params
			ps.setString(1,bo.getEname());
			ps.setString(2,bo.getDesg());
			ps.setFloat(3,bo.getBasicSalery());
			ps.setFloat(4, bo.getGrossSalery());
			ps.setFloat(5,bo.getNetSalery());
			//execute the Query
			 * result=ps.executeUpdate();
			 */		
	/*	catch(SQLException se) {
			se.printStackTrace();
			throw se;//exception throwing
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			//close Jdbc object
			try {
				if(ps!=null) 
					con.close();
				}
//				catch(SQLException se) {
					se.printStackTrace();
				}
				}//finally
		return result;
	}//method  */
//class


