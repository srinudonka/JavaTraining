package com.sailaja.spring_second_project.service;

import java.util.List;

import com.sailaja.spring_second_project.model.City;

public interface CityService {
	
	public String addCity(City city);
	
	public List<City> getListOfCities();
	
	public City getCityById(int id);
	
	public String updateRecordById(City city);
	
	
	
}
