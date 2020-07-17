package com.sailaja.spring_second_project.dao;

import java.util.List;

import com.sailaja.spring_second_project.model.City;

public interface CityDao {
	
	public String addCity(City city);
	
	public List<City> getListOfCities();

}
