package com.timbuchalka.springdemo.controller.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/requestMapppingAndParamDemo")
@Controller
public class RequestMappingAndParamDemoController {
	private static Logger LOGGER = LoggerFactory.getLogger(RequestMappingAndParamDemoController.class);
}
