package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.BO.CustomerBO;

public  class CustomerImpl implements ICustomerDAO {
private DataSource ds;
public static final String EMP_INSERT_QUERY="INSERT INTO REALTIMEDI_SPRING_CUSTOMER  VALUES(SP_CNO_SEQ1.NEXTVAL,?,?,?,?,?)";
public CustomerImpl(DataSource ds) {
	this.ds=ds;
}
@Override
public int  insertCustomer(CustomerBO bo) throws Exception
{
	int result=0;
	try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareCall(EMP_INSERT_QUERY); ){
		ps.setString(1,bo.getCname());
		ps.setFloat(2,bo.getcItem1());
		ps.setFloat(3,bo.getcItem2());
		ps.setFloat(4,bo.getcTBillamt());
		ps.setFloat(5,bo.getcADbillamt());
		result=ps.executeUpdate();
	}
	catch(SQLException se) {
		se.printStackTrace();
		throw se;//exception throwing
	}
	catch(Exception e) {
		e.printStackTrace();
		throw e;
	}
	return result;
}}
