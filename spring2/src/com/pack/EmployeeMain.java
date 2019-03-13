package com.pack;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new ClassPathXmlApplicationContext("hello.xml");
		Employee s=(Employee)c.getBean("emp");
		System.out.println(s);
		Employee s1=(Employee)c.getBean("emp");
		System.out.println(s1);
	}

}
