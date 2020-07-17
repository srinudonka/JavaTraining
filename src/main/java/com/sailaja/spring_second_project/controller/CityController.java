package com.sailaja.spring_second_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sailaja.spring_second_project.model.City;
import com.sailaja.spring_second_project.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	@Autowired
	private CityService cityService;


	@PostMapping("/addCity")
	public String addCity(City city) {
		return cityService.addCity(city);

	}

	@GetMapping("/listOfCities")
	public List<City> getListOfCities() {
		return cityService.getListOfCities();

	}
}
