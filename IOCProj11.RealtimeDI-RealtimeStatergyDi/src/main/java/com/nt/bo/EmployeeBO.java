package com.nt.bo;

public class EmployeeBO {
	private Integer eno;// optional for insert use case
	private String ename;
	private String desg;
	private Float basicSalery;
	private Float grossSalery;
	private Float netSalery;
	// alt+shift+s,r//to generate settters and getters
		// ctrl+A,cntrl+i//select code and do indentation
		// ctrl+shift+f//for formatting the code
	/**
	 * @return the eno
	 */
	public Integer getEno() {
		return eno;
	}
	/**
	 * @param eno the eno to set
	 */
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * @return the desg
	 */
	public String getDesg() {
		return desg;
	}
	/**
	 * @param desg the desg to set
	 */
	public void setDesg(String desg) {
		this.desg = desg;
	}
	/**
	 * @return the basicSalery
	 */
	public Float getBasicSalery() {
		return basicSalery;
	}
	/**
	 * @param basicSalery the basicSalery to set
	 */
	public void setBasicSalery(Float basicSalery) {
		this.basicSalery = basicSalery;
	}
	/**
	 * @return the grossSalery
	 */
	public Float getGrossSalery() {
		return grossSalery;
	}
	/**
	 * @param grossSalery the grossSalery to set
	 */
	public void setGrossSalery(Float grossSalery) {
		this.grossSalery = grossSalery;
	}
	/**
	 * @return the netSalery
	 */
	public Float getNetSalery() {
		return netSalery;
	}
	/**
	 * @param netSalery the netSalery to set 
	 */
	public void setNetSalery(Float netSalery) {
		this.netSalery = netSalery;
	}

}
