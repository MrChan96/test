package com.zr.spring.ioc.beans;

public class Person {
	private String name;
	private Car car;
	
	public Person(){
		System.out.println("������Person����");
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}

	public void sayHi(){
		System.out.println("�ҽ�" + name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + "]";
	}
}
