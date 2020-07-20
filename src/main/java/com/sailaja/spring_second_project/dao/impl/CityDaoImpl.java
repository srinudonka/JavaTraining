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

	String updateCitys = "UPDATE City as b set " +
			"name = :name," +
			"countryCode = :countrycode, " +
			"district = :district, "+
			"population = :population "+
			"where id = :id";



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

	@Override
	public City getCityById(int id) {
		TypedQuery<City> city = sessionFactory.getCurrentSession().createQuery("from City WHERE id = :id");
		city.setParameter("id", id);
		return city.getSingleResult();
	}

	@Override
	public String updateRecordById(City city) {
		// TODO Auto-generated method stub
		TypedQuery<City> updateCity = sessionFactory.getCurrentSession().createQuery(updateCitys);
		updateCity.setParameter("id", city.getId());
		updateCity.setParameter("name", city.getName());
		updateCity.setParameter("district", city.getDistrict());
		updateCity.setParameter("countrycode",city.getCountryCode());
		updateCity.setParameter("population",city.getPopulation());
		updateCity.executeUpdate();
		return "updated successfully";

	}
}