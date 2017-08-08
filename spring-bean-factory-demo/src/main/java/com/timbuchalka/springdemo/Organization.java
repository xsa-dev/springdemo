package com.timbuchalka.springdemo;

public class Organization {
	
	public String companyName;
	private int yearOfIncorporation;
	
	public Organization(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}

	public void corporateSlogann() {
		String slogan = "We build the ultimate driving machines!";
		System.out.println(slogan);
	}
	
	public static Organization createInstanse(String companyName, int yearOfIncorporation) {
		System.out.println("Invoking the static factory mrthod.........");
		return new Organization(companyName, yearOfIncorporation);
	}

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + "]";
	}
}
