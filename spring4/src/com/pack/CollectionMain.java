package com.pack;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=new ClassPathResource("hello.xml");//accessing xml file
		BeanFactory f=new XmlBeanFactory(res);
		JavaCollection s=(JavaCollection)f.getBean("collection");//s is a student object,will instantiate the bean with an id called studentbean
				//s.display();
		System.out.println(s.getAddressList());
		System.out.println(s.getAddressMap());
		System.out.println(s.getAddressProp());
		System.out.println(s.getAddressSet());
	}

}
