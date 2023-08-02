package com.nt.Controller;

import com.nt.DTO.CustomerDTO;
import com.nt.Service.ICustomerService;
import com.nt.VO.CustomerVo;

public class Maincontroller {
private ICustomerService service;

public Maincontroller(ICustomerService service) {
	this.service = service;
}
public String processCustomer(CustomerVo vo) throws Exception{
	CustomerDTO dto=new CustomerDTO();
	dto.setCname(vo.getCname());

	dto.setcItem1(Float.parseFloat(vo.getcItem1()));

	dto.setcItem2(Float.parseFloat(vo.getcItem2()));
	  
	String s=service.registerCustomer(dto);
	return s;
}
}
