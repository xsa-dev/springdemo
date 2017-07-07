package springdemo;

import java.util.Random;

import springdemo.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\n As an Organization, " + companyName + " provides an outstanding Ecommerce platform." + 
		"\nThe annual revenue exceeds " + random.nextInt(revenue) + "dollars." ;
		return service;
	}
}
