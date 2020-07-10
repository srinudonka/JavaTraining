package com.sailaja.spring_second_project.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sailaja.spring_second_project.domain.Address;
import com.sailaja.spring_second_project.domain.User;
import com.sailaja.spring_second_project.service.UserService;

@Service
@Qualifier("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Override
	public User getUser() {
		Address address = new Address("a-123","abcd","California","US");
		
		
		User user = new User();
		user.setUserId(12345);
		user.setUserName("Sailaja");
		user.setAddress(address);
		return user;
	}

}
