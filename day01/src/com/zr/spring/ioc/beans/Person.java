package com.zr.spring.ioc.beans;

public class Person {
	private String name;
	private Car car;
	
	public Person(){
		System.out.println("创建了Person对象");
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}

	public void sayHi(){
		System.out.println("我叫" + name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + "]";
	}
}
