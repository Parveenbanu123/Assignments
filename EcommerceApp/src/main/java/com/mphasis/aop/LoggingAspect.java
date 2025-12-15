package com.mphasis.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger logger=LoggerFactory.getLogger(LoggingAspect.class);
	
	@Pointcut("execution(* com.mphasis.controllers.*.*(..))")
	public void controllerLayer() {
		
	}
	
	@Pointcut("execution(* com.mphasis.service.*.*(..))")
	public void serviceLayer() {
		
	}
	
	@Pointcut("execution(* com.mphasis.dao.*.*(..))")
	public void daoLayer() {
		
	}
	
	@Pointcut("execution(* com.mphasis.exceptions.*.*(..))")
	public void exceptionLayer() {
		
	}
	
	@Pointcut("execution(* com.mphasis.repositories.*.*(..))")
	public void repositoryLayer() {
		
	}
	
	
	
//	@Before("execution(* com.mphasis.*.*.*(..))")
//	public void beforeEachMethod(JoinPoint joinPoint) {
//		logger.info("Entering method: {}",joinPoint.getSignature());
//	}
	
	@Before("controllerLayer()||serviceLayer()||daoLayer()")
	public void beforeEachMethod(JoinPoint joinPoint) {
		logger.info("Entering method: {}",joinPoint.getSignature());
	}
	
	@After("controllerLayer()||serviceLayer()||daoLayer()||repositoryLayer()")
	public void afterEachMethod(JoinPoint joinPoint) {
		logger.info(joinPoint.getSignature().getName());
	}
	
	@AfterReturning(pointcut="controllerLayer()||serviceLayer()||daoLayer()||repositoryLayer()",returning="result")
	public void afterReturningMethod(JoinPoint joinPoint,Object result) {
		logger.info("Exiting method: {}",joinPoint.getSignature());
		logger.info("Result->{}",result);
	}
	
	@AfterThrowing(pointcut = "controllerLayer()||serviceLayer()||daoLayer()||exceptionLayer()",throwing = "ex")
	public void afterExceptionThrown(JoinPoint joinPoint,Exception ex) {
		logger.error("Service Exception Thrown: {},message={}",joinPoint.getSignature(),ex.getMessage());
	}
	
	
}
