package com.timbuchalka.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.timbuchalka.springdemo.domain.HumanResourceDept;
import com.timbuchalka.springdemo.domain.Organization;


public class InitDestroyApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// create the bean
//		Organization org = (Organization) ctx.getBean("myorg");
//		
//		// invoce the company slogan via the bean
//		System.out.println(org.corporateSlogan());
//		
//		// Print Organization details
//		HumanResourceDept hrdept = (HumanResourceDept) ctx.getBean("myhrdept");
//		System.out.println(hrdept.hiringStatus(5500));
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
