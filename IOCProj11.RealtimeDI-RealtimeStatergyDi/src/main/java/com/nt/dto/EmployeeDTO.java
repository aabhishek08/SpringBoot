package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	private Integer eno;
	private String ename;
	private String desg;
	private Float basicSalery;
	
	
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
	 * @return the basicsalery
	 */
	public void setBasicSalery(Float basicSalery) {
		this.basicSalery = basicSalery;
		}
	public Float getBasicSalery() {
		return basicSalery;
	}
	/**
	 * @param basicsalery the basicsalery to set
	 */
	
	}
