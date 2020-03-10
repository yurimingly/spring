package spring.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class LookupMain {
	public static void main(String arg[]) {
		ApplicationContext context = new GenericXmlApplicationContext("DITest.xml");
		LookupEx lue = context.getBean("lookupEx", LookupEx.class);
		lue.doLookupEx();
	}
}
