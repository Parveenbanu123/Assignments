package com.mphasis.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger logger=LoggerFactory.getLogger(LoggingAspect.class);
	@Before("execution(* com.mphasis.service.*.*(..))")
	public void beforeEachMethod(JoinPoint joinPoint) {
		logger.info("Entering method: {}",joinPoint.getSignature().getName());
	}
	
	@After("execution(* com.mphasis.service.*.*(..))")
	public void afterEachMethod(JoinPoint joinPoint) {
		logger.info(joinPoint.getSignature().getName());
	}
	
	@AfterReturning("execution(* com.mphasis.service.*.*(..))")
	public void afterReturningMethod(JoinPoint joinPoint) {
		logger.info("Exiting method: {}",joinPoint.getSignature().getName());
	}
	
	@AfterThrowing(pointcut = "execution(* com.mphasis.service.*.*(..))",throwing = "ex")
	public void afterExceptionThrown(JoinPoint joinPoint,Exception ex) {
		logger.error("Service Exception Thrown: {},message={}",joinPoint.getSignature().getName(),ex.getMessage());
	}
	
	
}
