package com.sailaja.spring_second_project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sailaja.spring_second_project.dao.CountryDao;
import com.sailaja.spring_second_project.model.Country;
import com.sailaja.spring_second_project.service.CountryService;

@Service("countryServiceImpl")
public  class CountryServiceImpl implements CountryService{

	@Autowired
	private CountryDao countrydao;
	
	@Transactional("handleTransaction")
	@Override
	public String addCountry(Country country) {

		
		return countrydao.addCountry(country);
		
	}
	@Transactional("handleTransaction")
	@Override
	public  List<Country> getListOfCountries() {
		
		return countrydao.getListOfCountries();
	}
	@Transactional("handleTransaction")
	@Override
	public  String updateCountryByCode(Country country) {
		return countrydao.updateCountryByCode(country);
	}
	@Transactional("handleTransaction")
	@Override
	public  Country getCountryByCode(String code) {
		return countrydao.getCountryByCode(code);
	}
	
}
