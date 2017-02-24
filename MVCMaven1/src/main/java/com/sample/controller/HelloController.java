package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value = {"/", "/hello"}, method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("message","hello from spring");
		return "hello";
	}
}
