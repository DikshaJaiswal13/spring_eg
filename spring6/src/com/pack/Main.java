package com.pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=new ClassPathResource("hello.xml");
		BeanFactory f=new XmlBeanFactory(res);
		HelloWorld s=(HelloWorld)f.getBean("hello");//will invoke the constructor
		//s.test();
		System.out.println(s.getMsg1());
		System.out.println(s.getMsg2());
		HelloIndia s1=(HelloIndia)f.getBean("hello1");//will invoke the constructor
		//s.test();
		System.out.println(s1.getMsg1());
		System.out.println(s1.getMsg2());
		System.out.println(s1.getMsg3());
	}

}
