package com.timbuchalka.springdemo.serviceimpl;

import java.util.Random;

import com.timbuchalka.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		// TODO Auto-generated method stub
		Random random = new Random();
		String service = "\nAs an Organization, " + companyName + " offers word class Cloud computing infrastructure." + "\nThe annual income exceeds " + random.nextInt(revenue) + " dollars.";
		return service;
	}

	public void postConstruct() {
		System.out.println("cloudService: postConstruct called...............");
	}
	
	public void preDestroy() {
		System.out.println("cloudService: preDestroy called...............");
	}
	
}
