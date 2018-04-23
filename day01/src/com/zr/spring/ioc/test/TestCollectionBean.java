package com.zr.spring.ioc.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zr.spring.ioc.beans.CollectionBean;

public class TestCollectionBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionBean cb = (CollectionBean) ac.getBean("cb");
		System.out.println(cb);
	}

}
