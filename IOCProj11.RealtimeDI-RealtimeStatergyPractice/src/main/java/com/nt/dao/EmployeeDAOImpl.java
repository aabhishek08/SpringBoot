package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {
private DataSource ds;
public static final String EMP_INSERT_QUERY="INSERT INTO VALUES(SP_EMP_SEQ.NEXTVAL,?,?,?,?,?)";
/**
 * @param ds
 */
public EmployeeDAOImpl(DataSource ds) {
	this.ds = ds;
}
@Override
public int insertEmployee(EmployeeBO bo) throws Exception{
	int result=0;
	try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareCall(EMP_INSERT_QUERY);)
	{
		ps.setString(1,bo.getEname());
		ps.setString(2,bo.getEdesg());
		ps.setFloat(3,bo.getBasicsalery());
		ps.setFloat(4,bo.getNetsalery());
		result=ps.executeUpdate();
	}
	catch(SQLException se) {
		se.printStackTrace();
		throw se;
	}
	catch(Exception e) {
		e.printStackTrace();
		throw e;
	}
		return result;	
}
}
