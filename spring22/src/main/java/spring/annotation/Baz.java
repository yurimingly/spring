package spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class Baz {
	
	String name;

	@Value("winter")
	public void setName(String name) {
		this.name = name;
	}
	
	@Bean(name="wBar")
	public Bar gerBar() {
		Bar b = new Bar();
		b.setName(name);
		return b;
	}

}
