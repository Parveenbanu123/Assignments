package com.mphasis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.mphasis.beans.Course;
import com.mphasis.beans.Student;

@Configuration
@ComponentScan(basePackages = "com.mphasis")
@PropertySource("classpath:data.properties")
public class SpringConfiguration {
	
//	@Bean
//	public Student getStudent() {
//		return new Student(1,"Parveen",getCourse());
//	}
//	
//	@Bean
//	public Course getCourse() {
//		return new Course(1,"Java");
//	}
	
}
