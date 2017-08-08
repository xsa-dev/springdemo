package com.timbuchalka.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.timbuchalka.service.demo.GenericWelcomeService;
import com.timbuchalka.service.demo.WelcomeService;

@Controller
public class WelcomeController {

	@Autowired
	private GenericWelcomeService welcomeService;

	@RequestMapping("/")
	// http://localhost:8080/srpting-mvc-demo-1/
	public String doWelcome(Model model) {

		// 1.Retrieving the processed data
//		WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Aleksey Savin");

		// 2. Add data ti the model
		model.addAttribute("myWelcomeMessage", welcomeMessage);

		// 3. Return logical view name
		return "welcomeNew";
	}
}