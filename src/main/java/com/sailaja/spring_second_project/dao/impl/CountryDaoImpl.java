package com.sailaja.spring_second_project.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sailaja.spring_second_project.dao.CityDao;
import com.sailaja.spring_second_project.dao.CountryDao;
import com.sailaja.spring_second_project.model.City;
import com.sailaja.spring_second_project.model.Country;

@Repository
public class CountryDaoImpl implements CountryDao{
	

	@Autowired
	private  SessionFactory sessionFactory;
	
	String updateCountrys = "UPDATE Country as b set " +
			"name = :name," +
			"continent = :continent, " +
			"region = :region, "+
			"surfacearea = :surfacearea, "+
			"indepyear=:indepyear,"+
			"population=:population,"+
			"lifeexpectancy=:lifeexpectancy,"+
			"gnp=:gnp,"+
			"gnpold=:gnpold,"+
			"localname=:localname,"+
			"governamentform=:governamentform,"+
			"headofstate=:headofstate,"+
			"capital=:capital,"+
			"code2=code"+	
			
			"where code = :code";
	@Override
	public String addCountry(Country country) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(country);
		return "Added successfully";
	}

	@Override
	public List<Country> getListOfCountries() {
		TypedQuery<Country> listOfCountries = sessionFactory.getCurrentSession().createQuery("from Country");
		return listOfCountries.getResultList();
	}

	@Override
		public Country getCountryByCode(String code) {
		TypedQuery<Country> country = sessionFactory.getCurrentSession().createQuery("from Country WHERE code = :code");
		country.setParameter("code", code);
		return country.getSingleResult();
	}

	@Override
	
	public String updateCountryByCode(Country country) {
		
		TypedQuery<City> updateCountry = sessionFactory.getCurrentSession().createQuery(updateCountrys);
		updateCountry.setParameter("code", country.getCode());
		updateCountry.setParameter("name", country.getName());
		updateCountry.setParameter("continent", country.getContinent());
		updateCountry.setParameter("region", country.getRegion());
		updateCountry.setParameter("surfacearea", country.getSurfacearea());
		updateCountry.setParameter("indepyear", country.getIndepyear());
		updateCountry.setParameter("population", country.getPopulation());
		updateCountry.setParameter("lifeexpectancy", country.getLifeexpectancy());
		updateCountry.setParameter("gnp", country.getGnp());
		updateCountry.setParameter("gnpold", country.getGnpold());
		updateCountry.setParameter("localname", country.getLocalname());
		updateCountry.setParameter("governamentform", country.getGovernamentform());
		updateCountry.setParameter("headofstate", country.getHeadofstate());
		updateCountry.setParameter("capital", country.getCapital());
		updateCountry.setParameter("code2", country.getCode2());
		
		return "updated successfully";

	}

}
