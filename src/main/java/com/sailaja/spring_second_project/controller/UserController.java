package com.sailaja.spring_second_project.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sailaja.spring_second_project.domain.User;
import com.sailaja.spring_second_project.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	@Qualifier("userServiceImpl")
	UserService userService;
	
	@GetMapping("/get")
	public  String getString() throws IOException{
		
		ObjectMapper Obj = new ObjectMapper(); 
		User user = userService.getUser();
		return Obj.writeValueAsString(user);
	}

}
