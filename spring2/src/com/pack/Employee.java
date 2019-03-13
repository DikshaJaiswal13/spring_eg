package com.pack;
//pojo class
public class Employee {
private String name;
private int age;
public Employee(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public Employee() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

/*public String toString()//we are writing this method so that we can print object contents instead of printing object reference
{
	return "Employee [name=" + name + ", age=" + age + "]";
}*/
}
