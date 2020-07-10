package com.sailaja.spring_second_project.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/get")
	public  String getString() throws IOException{
		return "user String";
	}

}
