package spring.DI;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionExMain {
	public static void main(String arg[]) {
		ApplicationContext container = new GenericXmlApplicationContext("Collection.xml");
		CollectionEx c = container.getBean("coll", CollectionEx.class);
	}
}

