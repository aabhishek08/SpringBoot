package com.nt.beans;
public class Employee1 {
private int eno;
private int no;
private String ename;
private String eaddrs;
public Employee1(int eno,String ename,String eaddrs) {
	System.out.println("Employee1::3-param constructer");
	this.eno=eno;
	this.ename=ename;
	this.eaddrs=eaddrs;
}
public Employee1(int eno,String ename) {
	System.out.println("Employee1::2-param constructer");
	this.eno=eno;
	this.ename=ename;
}
public Employee1(String ename,String eaddrs) {
	System.out.println("Employee1::2-param constructer");
	this.ename=ename;
	this.eaddrs=eaddrs;
}
public void setName( int no) {
	this.no=no;
}
@Override
public String toString() {
	return "Employee1[eno="+eno+",ename="+ename+",eaddrs="+eaddrs+",no="+no+"]";
}
}
