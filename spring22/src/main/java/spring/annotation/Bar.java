package spring.annotation;

import org.springframework.beans.factory.annotation.Required; 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bar {
	
	String name;
	
	@Required
	@Value("fall")
	public void setName(String name) {
		this.name = name;
	}

	public void doBar() {
		System.out.println("bar name :: "+name);
	}
}