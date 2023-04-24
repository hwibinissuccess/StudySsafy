package Spring_01_DI_3_XML.src.com.ssafy.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//������ �����̳� ��ü�� ����
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		//�����̳ʷ� ���� ��ü�� �������ڴ�.
		Programmer p = (Programmer) context.getBean("programmer");
		p.coding();
		
	}
}
