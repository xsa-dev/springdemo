package com.timbuchalka.springdemo.serviceimpl;

import java.util.Random;

import com.timbuchalka.springdemo.service.RecruitmentService;

public class AgencyRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployes(String companyName, String departmentName, int numberOfRecruitments) {
		// TODO Auto-generated method stub
		Random random = new Random();
		String hiringFacts = "\n" + companyName + "'s " + departmentName + " hired " + random.nextInt(numberOfRecruitments) + " employees " + "using varios hiring agencies.";
		return hiringFacts;
	}

}
