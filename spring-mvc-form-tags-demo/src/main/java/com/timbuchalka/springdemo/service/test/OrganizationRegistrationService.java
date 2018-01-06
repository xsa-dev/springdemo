package com.timbuchalka.springdemo.service.test;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class OrganizationRegistrationService {
	
	public Map<String, String> populateTurnover() {
		Map<String, String> turnover = new LinkedHashMap<String, String>();
		turnover.put("none",  "----select-----");
		turnover.put("1000", "Less than $,1000");
		turnover.put("10000", "Greater than $1,000 but less than $10,000");
		turnover.put("100000", "Greater than $10,000 but less than $100,000");		
		return turnover;
	}

}
