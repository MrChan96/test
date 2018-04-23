package com.zr.spring.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.zr.spring.ioc.beans.Person;

public class TestPerson {

	public static void main(String[] args) {
		// ��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ֻҪ����ȡBean,�Ͳ��ᴴ��ʵ��,һ��BeanFactory���ǲ���,�����Ҫ�ӳټ���ͨ��ѧϰ������ʽʵ��
//		BeanFactory ac = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		// ��ȡBean
		Person p = (Person) ac.getBean("p1");
		// ����������г�����1��ͬ���Beanʱ�����,��֪��Ӧ��ѡ����һ��bean
//		Person p2 = ac.getBean(Person.class);
		Person p3 = ac.getBean("p1", Person.class);
		// Ĭ�ϴ��������Ķ����ǵ�����,ÿ�λ�ȡ���Ǵ�練��еõ�
		System.out.println(p == p3);	// true
		
		Person p4 = (Person)ac.getBean("p3");
		System.out.println(p4);
		
		Person p5 = (Person)ac.getBean("p4");
		System.out.println(p5);
		// ���ö��󷽷�
//		p.sayHi();
//		ac.close();
	}
}