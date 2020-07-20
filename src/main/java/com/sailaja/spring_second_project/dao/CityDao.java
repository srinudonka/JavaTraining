package com.sailaja.spring_second_project.dao;

import java.util.List;

import com.sailaja.spring_second_project.model.City;

public interface CityDao {
	
	public String addCity(City city);
	
	public List<City> getListOfCities();
	
	public City getCityById(int id);
	
	public String updateRecordById(City city);

}


	



	

