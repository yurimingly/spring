package spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class Baz {
	
	String name1;

	@Value("winter")
	public void setName1(String name1) {
		this.name1 = name1;
	}
	
	@Bean(name="wBar")//return b하니까 wbar라는 이름으로 등록됨
	public Bar gerBar() {
		System.out.println("@bean사용");
		Bar b = new Bar();
		b.setName(name1);
		return b;
	}

}
