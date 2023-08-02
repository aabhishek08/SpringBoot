package com.nt.BO;

public class CustomerBO {
private String cname;
private Integer eno;
private Float cItem1;
private Float cItem2;
private Float cTBillamt;
private Float cADbillamt;
public Integer getEno() {
	return eno;
}
/**
 * @param eno the eno to set
 */
public void setEno(Integer eno) {
	this.eno = eno;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Float getcItem1() {
	return cItem1 != null ? cItem1 : 0.0f;
}
public void setcItem1(Float cItem1) {
	this.cItem1 = cItem1;
}
public Float getcItem2() {
	return cItem2 != null ? cItem2 : 0.0f ;
}
public void setcItem2(Float cItem2) {
	this.cItem2 = cItem2;
}
public Float getcTBillamt() {
	return cTBillamt;
}
public void setcTBillamt(Float cTBillamt) {
	this.cTBillamt = cTBillamt;
}
public Float getcADbillamt() {
	return cADbillamt;
}
public void setcADbillamt(Float cADbillamt) {
	this.cADbillamt = cADbillamt;
}

}