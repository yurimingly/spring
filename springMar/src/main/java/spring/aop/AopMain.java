package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
		//컨테이너 생성
		ApplicationContext context
		=new GenericXmlApplicationContext("aopConfig.xml");
		
		GreetingService greeting
		=context.getBean("greetingTarget", GreetingService.class);
		
		greeting.sayHello("ezen"); 
		//이메소드를 실행하기전에 logaspect안에 있는 beforelogging이 실행됨. around안에있는 timecheck가 먼저 실행됨
		try {
			greeting.sayGoodbye("spring");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}
}
