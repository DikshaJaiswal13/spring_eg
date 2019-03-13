package com.pack;
//pojo class or bean class should be configured in xml
public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void display()
	{
		System.out.println("hello "+name);
	}
}
