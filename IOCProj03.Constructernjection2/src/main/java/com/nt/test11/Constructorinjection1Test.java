package com.nt.test11;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans1.WishmessageGenerater;

	public class Constructorinjection1Test {

		public static void main(String[] args) {
					//Hold spring bean cfg file name and location
					FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
			//create ioc container (BeanFactory container)
					XmlBeanFactory factory=new XmlBeanFactory(res);
					//get Target spring bean class object
					Object obj=factory.getBean("wmg");
					//invoke the b.method
					WishmessageGenerater generater=(WishmessageGenerater)obj;
					String result=generater.generateMessage("Abhi");
					System.out.println("wishme message is::"+result);
			}
	} 
