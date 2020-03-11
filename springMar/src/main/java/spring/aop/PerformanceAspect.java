package spring.aop;

import org.aspectj.lang.ProceedingJoinPoint; 
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {
	
	@Pointcut("execution(public * spring.aop..*sayHello(..))")
	private void pointCut() {}
	
   	@Around("execution(public * spring.aop..*sayHello(..))")//("pointCut()")
	public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable{
	Signature s= joinPoint.getSignature();
	String methodName = s.getName();//메서드이름출력 sayhello
	long startTime = System.nanoTime();
	 
	System.out.println("[Log]METHOD Before : " + methodName+"time check start"); 
	Object o = null;
		
	 
	try{
	 o = joinPoint.proceed();//핵심로직 전에 모든것이 처리되고
	}catch(Exception e){
	 System.out.println("[Log]METHOD error : "+ methodName);
	}
	 long endTime = System.nanoTime();
	 System.out.println("[Log]METHOD After : " + methodName+" time check end");
	 System.out.println("[Log] "+ methodName + " Processing time is "+(endTime - startTime)+"ns");
	 return o;
	}       
	}
