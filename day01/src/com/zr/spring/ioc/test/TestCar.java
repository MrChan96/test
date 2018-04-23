package com.zr.spring.ioc.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zr.spring.ioc.beans.Car;

public class TestCar {

	public static void main(String[] args) {
		// 创建容器
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 获取Bean
		Car bmw = (Car) ac.getBean("bmw");
		System.out.println(bmw);
		Car benz = (Car) ac.getBean("benz");
		System.out.println(benz);
		
		ac.close();
	}
}