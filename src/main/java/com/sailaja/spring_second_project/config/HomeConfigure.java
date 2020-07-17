package com.sailaja.spring_second_project.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.sailaja.spring_second_project.model.City;

@Configuration
@PropertySource("classpath:resources/db.properties")
@EnableTransactionManagement
@EnableWebMvc
@ComponentScan(basePackages = "com.sailaja.spring_second_project")

public class HomeConfigure {

	@Autowired
	private Environment env;

	@Bean
	public DataSource getDataSource(){
		BasicDataSource basicDatasource = new BasicDataSource();
		basicDatasource.setDriverClassName(env.getProperty("db.driver"));
		basicDatasource.setUrl(env.getProperty("db.url"));
		basicDatasource.setUsername(env.getProperty("db.username"));
		basicDatasource.setPassword(env.getProperty("db.password"));
		return basicDatasource;
	}

	@Bean
	public LocalSessionFactoryBean getSessionFactoryBean() {

		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(getDataSource());

		Properties prop = new Properties();
		prop.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		prop.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
		prop.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
		lsfb.setHibernateProperties(prop);
		lsfb.setAnnotatedClasses(City.class);
		return lsfb;


	}
	@Bean(name="handleTransaction")
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager  htm = new HibernateTransactionManager();
		htm.setSessionFactory(getSessionFactoryBean().getObject());
		return htm;
	}
}
