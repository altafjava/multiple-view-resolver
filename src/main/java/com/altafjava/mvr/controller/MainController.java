package com.altafjava.mvr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@GetMapping("/")
	public String index() {
		return "index.tl";
	}

	@RequestMapping(value = { "/test-thymeleaf" }, method = RequestMethod.GET)
	public String testThymeleafView() {
		return "page.tl";
	}

	@GetMapping(value = { "/test-jsp" })
	public String testJspView() {
		return "test-jsp";
	}

	@GetMapping("/test-freemarker")
	public String testFreeMarkerView() {
		return "test-freemarker";
	}
}
