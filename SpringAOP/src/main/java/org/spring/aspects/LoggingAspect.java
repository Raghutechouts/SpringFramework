package org.spring.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@Before("execution(public void circle())")
	public void loggerAdvice() {
		System.out.println("this is logger msg before method execution");
	}
	@After("execution(public void circle())")
	public void loggerAdvice2() {
		System.out.println("this is logger msg After method execution");
	}
	
}
