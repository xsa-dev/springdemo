package com.alekseysavin;

import java.util.Random;

import springdemo.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		// TODO Auto-generated method stub
		Random random = new Random();
		String service = "\nAs an Organization, " + companyName + " offers word class Cloud computing infrastructure." + "\nThe annual income exceeds " + random.nextInt(revenue) + "dollars.";
		return service;
	}

}
