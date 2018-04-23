package com.zr.spring.ioc.beans;

public class Car {
	private String name;
	private String producer;
	private double price;
	private int speed;
	
	public Car(String name, String producer, double price) {
		super();
		this.name = name;
		this.producer = producer;
		this.price = price;
	}
	public Car(String name, String producer, int speed) {
		this.name = name;
		this.producer = producer;
		this.speed = speed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", producer=" + producer + ", price=" + price + ", speed=" + speed + "]";
	}

	
}
