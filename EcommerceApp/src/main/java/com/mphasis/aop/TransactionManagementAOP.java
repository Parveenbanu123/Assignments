package com.mphasis.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class TransactionManagementAOP {

	@Around("@annotation(org.springframework.transaction.annotation.Transactional)")
	public Object transactionAdvice(ProceedingJoinPoint pjp) throws Throwable{
		Object result=new Object();
		try {
			//beginTransaction();
			 result=pjp.proceed();
			//commitTransaction();
		} catch (Throwable e) {
			//rollbackTransaction();
			e.printStackTrace();
		}
		return result;
		
	}
}
