package spring.annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bar {

	String name;

	
	 @Required
	 @Value("fall") //Baz에서 winter였는데 name이 fall이 됨
	 public void setName(String name) {
		this.name = name;
	}

	public void doBar() {
		System.out.println("bar name :: " + name);
	}
}
