package com.sailaja.spring_second_project.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sailaja.spring_second_project.dao.CityDao;
import com.sailaja.spring_second_project.model.City;

@Repository
public class CityDaoImpl implements CityDao{
	
	@Autowired
	private  SessionFactory sessionFactory;
	
	

	@Override
	public String addCity(City city) {
		
		sessionFactory.getCurrentSession().save(city);
		return "Added successfully";
	}

	@Override
	public List<City> getListOfCities() {
		TypedQuery<City> listOfCities = sessionFactory.getCurrentSession().createQuery("from City");
		return listOfCities.getResultList();
	}





}
