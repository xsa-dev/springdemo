package com.timbuchalka.springdemo.serviceimpl;

import java.util.Random;

import com.timbuchalka.springdemo.service.RecruitmentService;

public class ReferalRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployes(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		String hiringFacts = "\n" + companyName + "'s " + departmentName + " hired " + random.nextInt(numberOfRecruitments) + " employees " + "which were refered to the company by employees.";
		return hiringFacts;
	}

}
