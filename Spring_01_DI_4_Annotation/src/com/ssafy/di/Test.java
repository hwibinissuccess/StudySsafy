package Spring_01_DI_4_Annotation.src.com.ssafy.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//스프링 컨테이너 객체를 빌드
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		Programmer p = context.getBean("p", Programmer.class);
		p.coding();
	}
}
