package com.sailaja.spring_second_project.dao;

import java.util.List;

import com.sailaja.spring_second_project.model.Country;

public interface CountryDao {
	
	public  String addCountry(Country country);
	public  List<Country> getListOfCountries() ;

	public  String updateCountryByCode(Country country) ;
	public  Country getCountryByCode(String code) ;

}
