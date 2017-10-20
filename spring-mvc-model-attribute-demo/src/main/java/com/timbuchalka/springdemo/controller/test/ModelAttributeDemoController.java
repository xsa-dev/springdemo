package com.timbuchalka.springdemo.controller.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.timbuchalka.springdemo.domain.Address;

@Controller
public class ModelAttributeDemoController {
	private static Logger LOGGER = LoggerFactory.getLogger(ModelAttributeDemoController.class);
	
	@RequestMapping(value = "/home")
	public String home() {
		LOGGER.info("INSIDE home: " + System.currentTimeMillis());
		return "modelAttributeHome";
	}
	
	// version 2 of our home() method
	@RequestMapping(value = "/home2")
	public ModelAndView home2() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("modelAttributeHome");
		mav.addObject("anAddress", new Address());
		return mav;
	}
	
	// version 3 of our home() method
	@RequestMapping(value = "/home3")
	public ModelAndView home3() {
		ModelAndView mav = new ModelAndView("modelAttributeHome");
		mav.addObject("anAddress", new Address());
		return mav;
	}
	
	// version 4 of our home() method
		@RequestMapping(value = "/home4")
		public ModelAndView home4() {
			return new ModelAndView("modelAttributeHome", "anAddress", new Address("Melbourne", "3000"));		
		}
		
	// version 5 of our home() method
		@RequestMapping(value = "/home5")
		public String home5(Model model) {
			model.addAttribute("anAddress", new Address("Brisbane", "4000"));
			return "modeAttributeHome";		
		}
	
	/*
	 * Test series to determine the nature sof the @ModelAttribute annotation (on a method)
	 * to add multiple attributes
	 */
	@ModelAttribute
	public void modelAttributeTest1(Model model) {
		LOGGER.info("INSIDE modelAttributeTest1: " + System.currentTimeMillis());
		model.addAttribute("testdata1A", "Welcome to the @ModelAttribute Test Bed!");
		model.addAttribute("testdata1B", "We will test both usage of the @ModelAttribute, on methods and onmethod arguments");
	}
	
	/// Test 2: Demonstrating the usage of the 'name' attribute of the @ModelAttribute annotation (on method)
	@ModelAttribute(name="testdata2")
	public String modelAttributeTest2() {
		LOGGER.info("INSIDE modelAttributeTest2");
		return "We will conduct a series of test here.";
	}
	
	// Test 3: Demonstrating the usage of the @ModelAttribute annotation (on a method) to implicity add an attribute
	// by returning it and also demonstration the usage of the 'value' attribute of the @ModelAttribute annotation (on a method)
	@ModelAttribute(value="testdata3") 
	public Address modelAttributeTest3() {
		LOGGER.info("INSIDE modelAttributeTest3");
		return new Address ("Adelaide", "5000");
	}
	
	// Test 4: Demonstrate the default naming strategy of the @ModelAttribute annotation (on a method)
	@ModelAttribute
	public Address modelAttributeTest4() {
		LOGGER.info("INSIDE modelAttribureTest4");
		return new Address("Sydney", "2000");
	}
}
