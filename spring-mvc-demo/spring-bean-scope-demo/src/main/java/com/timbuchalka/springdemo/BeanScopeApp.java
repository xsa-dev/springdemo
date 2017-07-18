package com.timbuchalka.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.timbuchalka.springdemo.domain.HumanResourceDept;
import com.timbuchalka.springdemo.domain.Organization;


public class BeanScopeApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		Organization org2 = (Organization) ctx.getBean("myorg");
		
		org2.setPostalCode("98989");
		
		// invoce the company slogan via the bean
//		System.out.println(org.corporateSlogan());
		
		// Print Organization details
//		HumanResourceDept hrdept = (HumanResourceDept) ctx.getBean("myhrdept");
//		System.out.println(hrdept.hiringStatus(5500));
		
		
		System.out.println(org);
		System.out.println(org2);
		
		if (org == org2) {
			System.out.println("Singleton scope test: org and org2 to the same instance");
		}
		else {
			System.out.println("Both org and org2 are separate instances");
		}
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
