package com.mphasis.beans;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpELDemoClass {
	
	@Value("#{10+20}")
	private int add;
	
	@Value("#{5*7}")
	private int mul;
	
	@Value("#{5 div 2}")
	private float division;
	
	@Value("#{'Parveen'.length()>7?'Hai':'Hello'}")
	private String result;
	
	@Value("#{5>3}")
	private boolean flag;
	
	@Value("#{'Hello'.concat(' World')}")
	private String concatStr;
	
	@Value("#{T(java.time.LocalDate).now()}")
	private LocalDate todayDate;
	
	@Value("#{T(java.lang.Math).pow(5,2)}")
	private double powerVal;
	
	//@Value("#{T(java.util.Arrays).asList('Parveen,banu,Saranya,Ashik,Wahith'.split(','))}")
	@Value("#{'Parveen,banu,Saranya,Ashik,Wahith'.split(',')}")
	private List<String> nameList;
	
	public void printAll() {
		System.out.println("Addition: "+add);
		System.out.println("Multiplication: "+mul);
		System.out.println("Division: "+division);
		System.out.println(result);
		System.out.println(flag);
		System.out.println("Concatination: "+concatStr);
		System.out.println("Today's Date: "+todayDate);
		System.out.println("Power value: "+powerVal);
		nameList.forEach(System.out::println);
	}
}
