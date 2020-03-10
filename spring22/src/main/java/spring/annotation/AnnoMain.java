package spring.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AnnoMain {
	
	public static void main(String[] args) {
		AbstractApplicationContext container=
				new GenericXmlApplicationContext("annoTest.xml");
		Foo f = container.getBean("foo", Foo.class);
		f.doFoo();
		
		Bar b = container.getBean("wBar", Bar.class);
		
		container.registerShutdownHook();
		
	}

}
