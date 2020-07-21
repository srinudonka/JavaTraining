package com.sailaja.spring_second_project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COUNTRY")
public class Country {
	
			
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Column(name="CODE")
		private String code;
		
		@Column(name="NAME")
		private String name;
		
		@Column(name="CONTINENT")
		private String continent;
		
		@Column(name="REGION")
		private String region;
		
		@Column(name="SURFACEAREA")
		private float surfacearea;
		
		@Column(name="INDEPYEAR")
		private int indepyear;
		
		@Column(name="POPULATION")
		private int population;
		
		@Column(name="LIFEEXPECTANCY")
		private float lifeexpectancy;
		
		@Column(name="GNP")
		private float gnp;
		
		@Column(name="GNPOLD")
		private float gnpold;
		
		@Column(name="LOCALNAME")
		private String localname;
		
		@Column(name="GOVERNAMENTFORM")
		private String governamentform;
		
		@Column(name="HEADOFSTATE")
		private String headofstate;
		
		@Column(name="CAPITAL")
		private int capital;
		
		@Column(name="CODE2")
		private String code2;
		
		
		public Country() {
			
			
		}
		public Country(String code,String name,String continent,String region,float surfacearea,int indepyear,int population,
				float lifeexpectancy,float gnp,float gnpold,String localname,
				String governamentform,String headofstate,int capital,String code2) {
			super();
			this.code = code;
			this.name = name;
			this.continent=continent;
			this.region=region;
			this.surfacearea=surfacearea;
			this.indepyear=indepyear;
			this.population=population;
			this.lifeexpectancy=lifeexpectancy;
			this.gnp=gnp;
			this.gnpold=gnpold;
			this.localname=localname;
			this.governamentform=governamentform;
			this.headofstate=headofstate;
			this.capital=capital;
			this.code2=code2;
			
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getContinent() {
			return continent;
		}
		public void setContinent(String continent) {
			this.continent = continent;
		}
		public String getRegion() {
			return region;
		}
		public void setRegion(String region) {
			this.region = region;
		}
		public float getSurfacearea() {
			return surfacearea;
		}
		public void setSurfacearea(float surfacearea) {
			this.surfacearea = surfacearea;
		}
		public int getIndepyear() {
			return indepyear;
		}
		public void setIndepyear(int indepyear) {
			this.indepyear = indepyear;
		}
		public int getPopulation() {
			return population;
		}
		public void setPopulation(int population) {
			this.population = population;
		}
		public float getLifeexpectancy() {
			return lifeexpectancy;
		}
		public void setLifeexpectancy(float lifeexpectancy) {
			this.lifeexpectancy = lifeexpectancy;
		}
		public float getGnp() {
			return gnp;
		}
		public void setGnp(float gnp) {
			this.gnp = gnp;
		}
		public float getGnpold() {
			return gnpold;
		}
		public void setGnpold(float gnpold) {
			this.gnpold = gnpold;
		}
		public String getLocalname() {
			return localname;
		}
		public void setLocalname(String localname) {
			this.localname = localname;
		}
		public String getGovernamentform() {
			return governamentform;
		}
		public void setGovernamentform(String governamentform) {
			this.governamentform = governamentform;
		}
		public String getHeadofstate() {
			return headofstate;
		}
		public void setHeadofstate(String headofstate) {
			this.headofstate = headofstate;
		}
		public int getCapital() {
			return capital;
		}
		public void setCapital(int capital) {
			this.capital = capital;
		}
		public String getCode2() {
			return code2;
		}
		public void setCode2(String code2) {
			this.code2 = code2;
		}
		

}
