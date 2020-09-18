package com.conssc.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Mybefore implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("扩展前");
		
	}

}
