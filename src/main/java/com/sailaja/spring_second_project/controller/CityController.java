package com.sailaja.spring_second_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sailaja.spring_second_project.model.City;
import com.sailaja.spring_second_project.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	@Autowired
	private CityService cityService;


	@PostMapping("/addCity")
	public String addCity(@RequestBody City city) {
		return cityService.addCity(city);

	}

	@GetMapping("/listOfCities")
	public List<City> getListOfCities() {
		return cityService.getListOfCities();
	}
	
	@PutMapping("/updateCity")
	public @ResponseBody String updateCity(@RequestBody City city) {
        return cityService.updateRecordById(city);
	}
	

	@GetMapping("/cityById/{id}")
	public ResponseEntity<City> getIdByCity(@PathVariable int id) {

		City city = cityService.getCityById(id);

		if (city != null) {
			return ResponseEntity.ok(city);
		}
		return null;

	}
	
	
}
