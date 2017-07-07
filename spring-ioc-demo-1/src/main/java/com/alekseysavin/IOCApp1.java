package com.alekseysavin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		// create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		// invoce the company slogan via the bean
		org.corporateSlogann();
		
		// close the application context (container)
		((FileSystemXmlApplicationContext) ctx).close();
	}

}
