package javabean;

public class student implements java.io.Serializable{
private String c;
private int m1;
private int m2;
public void setdata(int m1) {
	this.m1=m1;
}
public void setdata1(int m2) {
	this.m2=m2;
}
public void setName(String c) {
	this.c=c;
	}
public int getdata() {
return m1;
}
public int getdata1() {
	return m2;
}
public String  setName() {
	return c;
	}

	}





