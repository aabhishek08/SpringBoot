package com.nt.beans1;

import java.util.Date;

public class WishmessageGenerater {
	private Date date;
	private int a;
		public WishmessageGenerater (Date date,int a) {
			this.date=date;
			this.a=a;
		System.out.println("ABadapnada"+a);
		}
	public String generateMessage(String user) {
		int hour = date.getHours();
		System.out.println(hour);
		if (hour < 12) {
			return "good morning::" + user;
		} else if (hour < 16) {
			return "good afternoon::" + user;
		} else if (hour < 20) {
			return "good evening::" + user;
		} else
			return "good night::" + user;
	}
}
