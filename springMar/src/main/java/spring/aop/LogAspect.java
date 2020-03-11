package spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	
@Pointcut("execution(public * spring.aop..*sayHello(..))")
private void publicPointCut() {}

@Before("publicPointCut()")
public void beforeLogging(JoinPoint point) {
System.out.println("메서드 명 : "+point.getSignature().getName());
System.out.println("** 메서드 호출 전**");
}

@AfterReturning(pointcut="publicPointCut()", returning="returnValue")
public void afterLogging(JoinPoint point,Object returnValue){ //후처리끝
System.out.println("** 메서드 호출 후**");
}   

@AfterThrowing(pointcut="publicPointCut()", throwing="ex")
public void throwingLogging(Exception ex){
System.out.println("** 예외 발생 : "+ex.getMessage()+"**");
}

@After("publicPointCut()")
public void alwaysLogging(){
System.out.println("** 항상 실행 **");      
}
}
