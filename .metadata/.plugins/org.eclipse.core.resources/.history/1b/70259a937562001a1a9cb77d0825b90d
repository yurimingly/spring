package spring.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIMain {
	
	public static void main(String arg[]) {
		ApplicationContext container = new GenericXmlApplicationContext("DITest.xml");
		//goekd파일로부터 설정정보 읽어와서 생성자통해서 
		
		Foo f = container.getBean("foo",Foo.class);
				//어떤 타입의 bean이든 다 꺼내와야하니까/ Foo.class해야 나중에 캐스팅할 필요없어진다.\
		f.doFoo();
	}

}