package spring.chap01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

//공통관심사항으로 지정해서 사용한다. Aspect는 공통관심사항이라는 말로 자주 쓰인다.
public class LoggingAspect {
 private Log log = LogFactory.getLog(getClass());
 
 public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
  log.info("기록 시작");
  StopWatch stopWatch = new StopWatch();
  try {   stopWatch.start();
   Object retValue = joinPoint.proceed();
   return retValue;
  } catch (Throwable e) { throw e;
  } finally {
   stopWatch.stop();
   log.info("기록 종료");
   log.info(joinPoint.getSignature().getName() + "실행 시간 : " + stopWatch.getTotalTimeMillis());
   }
  }
 
}