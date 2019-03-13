package com.pack;

//import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;




/* client prog*/
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Resource res=new ClassPathResource("hello.xml");//accessing xml file
		BeanFactory f=new XmlBeanFactory(res);//accessing xml file using beanfactory interface
		
*/		
		ApplicationContext f=new ClassPathXmlApplicationContext("beans.xml");
		Student s=(Student)f.getBean("emp");//s is a student object,will instantiate the bean with an id called studentbean
				s.display();
	}

}
