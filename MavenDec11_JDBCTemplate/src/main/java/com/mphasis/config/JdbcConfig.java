package com.mphasis.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan("com.mphasis")
public class JdbcConfig {
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource ds) {
		return new JdbcTemplate(ds);
	}
	
	@Bean
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate(DataSource ds) {
		return new NamedParameterJdbcTemplate(ds);
	}
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/mysql_proj");
		ds.setUsername("root");
		ds.setPassword("root@39");
		return ds;
	}
	
	
}
