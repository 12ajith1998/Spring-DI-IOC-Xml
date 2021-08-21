package com.luv2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		boolean result=(theCoach==alphaCoach);
		
		System.out.println("pointing to the same object: "+result);
		
		System.out.println("memory for theCoach: "+theCoach);
		
		System.out.println("memory for alphaCoach: "+alphaCoach);
	}

}
