package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMgmtService;
import com.nt.vo.EmployeeVO;

public class MainController {
//HAS-A  property
	private IEmployeeMgmtService service;

/**
 * @param service
 */
public MainController(IEmployeeMgmtService service) {
	System.out.println("MainController.MainController()"); 
	this.service = service;
}
public String processEmployee(EmployeeVO vo)throws Exception{
	//convert Employee class object to EmployeeDTO class obj
EmployeeDTO dto=new EmployeeDTO();
dto.setEname(vo.getEname()); 
dto.setDesg(vo.getDesg());
dto.setBasicSalery(Float.parseFloat(vo.getBasicSalery()));
//use service
String result=service.registerEmployee(dto);
return result;
}
}