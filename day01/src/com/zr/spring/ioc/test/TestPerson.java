package com.zr.spring.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.zr.spring.ioc.beans.Person;

public class TestPerson {

	public static void main(String[] args) {
		// 创建容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 只要不获取Bean,就不会创建实例,一般BeanFactory我们不用,如果需要延迟加载通过学习其它方式实现
//		BeanFactory ac = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		// 获取Bean
		Person p = (Person) ac.getBean("p1");
		// 如果容器中有超过个1个同类的Bean时会出错,不知道应该选择那一个bean
//		Person p2 = ac.getBean(Person.class);
		Person p3 = ac.getBean("p1", Person.class);
		// 默认创建出来的对象都是单例的,每次获取都是从绶存中得到
		System.out.println(p == p3);	// true
		
		Person p4 = (Person)ac.getBean("p3");
		System.out.println(p4);
		
		Person p5 = (Person)ac.getBean("p4");
		System.out.println(p5);
		// 调用对象方法
//		p.sayHi();
//		ac.close();
	}
}