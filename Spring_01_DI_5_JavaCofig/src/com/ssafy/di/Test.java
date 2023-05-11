package com.ssafy.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//스프링 컨테이너 객체를 빌드해야죠
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Desktop d1 = context.getBean("desktop", Desktop.class);
		Desktop d2 = context.getBean("desktop", Desktop.class);
		
		System.out.println(d1 == d2);
		
		
	}
}
