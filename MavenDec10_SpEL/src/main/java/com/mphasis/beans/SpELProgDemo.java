package com.mphasis.beans;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

@Component
public class SpELProgDemo {
	
	public void runExpression() {
		
		ExpressionParser parser=new SpelExpressionParser();
		Expression exp=parser.parseExpression("10+20");
		System.out.println(exp.getValue());
		
		exp=parser.parseExpression("'Hello'.length()");
		System.out.println(exp.getValue());
		
		int num=20;
		StandardEvaluationContext ctx=new StandardEvaluationContext();
		ctx.setVariable("num",num);
		exp=parser.parseExpression("#num%2==0?'Even':'Odd'");
		System.out.println(exp.getValue(ctx));
		
		
	}
	
}
