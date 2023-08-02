package com.nt.Service;

import com.nt.BO.CustomerBO;
import com.nt.DAO.ICustomerDAO;
import com.nt.DTO.CustomerDTO;

public class CustomerIServicempl implements ICustomerService {
private ICustomerDAO dao;

public CustomerIServicempl(ICustomerDAO dao) {
	this.dao = dao;
}
@Override
public String registerCustomer(CustomerDTO dto) throws Exception{
	CustomerBO bo=new CustomerBO();
	
	bo.setCname(dto.getCname());
	bo.setcItem1(dto.getcItem1());
	bo.setcItem2(dto.getcItem2());
	Float cTBillamt=bo.getcItem1()+bo.getcItem2();
	Float cADbillamt=cTBillamt-cTBillamt*0.2f;
	bo.setcTBillamt(cTBillamt);
	bo.setcADbillamt(cADbillamt);
	int count=dao.insertCustomer(bo);
	return count==1?"Toatal billamt\n"+cTBillamt+"After the discount:-"+cADbillamt:"not registered";
}
}
