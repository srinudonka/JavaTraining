package com.sailaja.spring_second_project.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	
	@RequestMapping(value="/get")
	public  String getString() throws IOException{
		return "home String";
	}
}
