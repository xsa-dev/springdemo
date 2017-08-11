package com.timbuchalka.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.lookup.IsolationLevelDataSourceRouter;

import com.timbuchalka.springdemo.dao.OrganizationDao;
import com.timbuchalka.springdemo.daoimpl.OrganizationDaoImpl;
import com.timbuchalka.springdemo.domain.Organization;

public class JdbcTemplateClassicApp2 {

	public static void main(String[] args) {
		// creating the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// Create the bean
		OrganizationDao dao = (OrganizationDaoImpl) ctx.getBean("orgDao");
		
		// Creating seed data
		DaoUtils.createSeedData(dao);
		
		// List organizations
		List<Organization> orgs = dao.getAllOrganizations();
		DaoUtils.pringOrganizations(orgs, DaoUtils.readOperation);
		
		// Creaate a new organization record
		Organization org = new Organization("General Electric", 1978, "98989", 5776, "Imagination at work");
		boolean isCreated = dao.create(org);
		DaoUtils.printSuccessFailure(DaoUtils.createOperation, isCreated);
		DaoUtils.pringOrganizations(dao.getAllOrganizations(), DaoUtils.readOperation);

		DaoUtils.printOrganizationCount(dao.getAllOrganizations(), DaoUtils.createOperation);

		// Cleanup
		 dao.cleanup();
		DaoUtils.printOrganizationCount(dao.getAllOrganizations(), DaoUtils.cleanupOperation);
		
		//close the application context
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
