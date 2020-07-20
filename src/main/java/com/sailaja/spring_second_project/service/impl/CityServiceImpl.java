package com.sailaja.spring_second_project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sailaja.spring_second_project.dao.CityDao;
import com.sailaja.spring_second_project.model.City;
import com.sailaja.spring_second_project.service.CityService;

@Service("cityServiceImpl")
public class CityServiceImpl implements CityService{
	
	@Autowired
	private CityDao cityDao;
	
	@Transactional("handleTransaction")
	@Override
	public String addCity(City city) {
		
		return cityDao.addCity(city);
		
	}

	@Transactional("handleTransaction")
	@Override
	public List<City> getListOfCities() {
		// TODO Auto-generated method stub
		return cityDao.getListOfCities();
	}

	@Transactional("handleTransaction")
	@Override
	public City getCityById(int id) {
		// TODO Auto-generated method stub
		return cityDao.getCityById(id);
	}

	@Transactional("handleTransaction")
	@Override
	public String updateRecordById(City city) {
		// TODO Auto-generated method stub
		return cityDao.updateRecordById(city);
	}
}
