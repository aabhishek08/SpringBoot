package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
//HAS-A property
	private IEmployeeDAO dao;

	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
	System.out.println("EmployeeMgmtServiceImpl.1-param constructer");
		this .dao=dao;
	}
	
	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {

		//prepare BO class obj having persistable data
		EmployeeBO bo=new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setBasicSalery(dto.getBasicSalery());
		//write b.logic to calculate grossSalery and Net Salery
				float grossSalery=dto.getBasicSalery()+dto.getBasicSalery()*0.4f;//+40% on basic salery
				float netSalery=grossSalery+dto.getBasicSalery()*0.2f;//-20% on grossSalery
		bo.setGrossSalery(grossSalery);
		bo.setNetSalery(netSalery);
		//use DAO
		int count=dao.insertEmployee(bo);
		//generate final result
		return count==1?"Employee tregistered with netSalery::"+netSalery:"Employee not registered with the next salery "+netSalery;
	}//method
	
}//class 
