package spring.DI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIMain {
	
	public static void main(String arg[]) {
		AbstractApplicationContext container 
		= new GenericXmlApplicationContext("DITest.xml");
		//해당 파일로부터 설정정보 읽어와서 생성자통해서 
		
		Foo f = container.getBean("foo2",Foo.class);
				//어떤 타입의 bean이든 다 꺼내와야하니까/ Foo.class해야 나중에 캐스팅할 필요없어진다.\
		f.doFoo();
		container.registerShutdownHook();
	}

}