package com.nt.Maincontroller;

import com.nt.DTO.EmployeeDTO;
import com.nt.Service.IEmployeeService;
import com.nt.VO.EmployeeVO;

public class Maincontroller {
private IEmployeeService service;

public Maincontroller(IEmployeeService service) {
	this.service = service;
}
public String processEmployee(EmployeeVO vo) throws Exception{
EmployeeDTO dto=new EmployeeDTO();
dto.setEname(vo.getBasicsalery());
dto.setEdesg(vo.getEdesg());
dto.setBasicsalery(Float.parseFloat(vo.getBasicsalery()));
String c=service.registerEmployee(dto);
return c;
}
}
