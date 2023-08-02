package com.nt.Service;

import com.nt.DTO.EmployeeDTO;
import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;

public class EmployeeServiceImpl implements IEmployeeService{
private IEmployeeDAO dao;

public EmployeeServiceImpl(IEmployeeDAO dao) {
	this.dao = dao;
}
@Override
public String registerEmployee (EmployeeDTO dto) throws Exception{
	EmployeeBO bo=new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setEdesg(dto.getEdesg());
		bo.setBasicsalery(dto.getBasicsalery());
		Float grosssalery=dto.getBasicsalery()+dto.getBasicsalery()*0.4f;
		Float netsalery=grosssalery+dto.getBasicsalery()*0.2f;
		bo.setGrosssalery(grosssalery);
		bo.setNetsalery(netsalery);
		int count=dao.insertEmployee(bo);
		return count==1?"Succesfully registered"+netsalery:"Succesfully not tregisetered"+netsalery;
	}
}

