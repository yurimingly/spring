package spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Foo {
	Bar bar;


	/*
	 * @Autowired
	 * 
	 * @Qualifier("second")
	 */
	
@Resource
public void setBar(Bar bar) {
	System.out.println("setBar이 실행되었습니다.");
		this.bar = bar;
	}


public void doFoo(){
	bar.doBar();
}

@PostConstruct
public void start() {System.out.println("foo초기화");}
@PreDestroy
public void stop() {System.out.println("foo소멸");}

}