package spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("greetingTarget")
public class GreetingServiceImpl implements GreetingService {

private String greeting;

@Value("greetingTarget") //string이니까
public void setGreeting(String greeting) {
this.greeting = greeting;       
}

@Override
public void sayHello(String name) {
System.out.println("sayHello : " + greeting + ":" + name);      
}

@Override
public void sayGoodbye(String name) throws Exception{
System.out.println("sayGoodbye : " + greeting + ":" + name);

throw new Exception("강제 예외 발생"); //핵심로직끝났으니 강제종료
}
}
