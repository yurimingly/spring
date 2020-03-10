package spring.chap01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainForAop {
//ApplicationContext : 컨테이너
public static void main(String[] args) {
 String[] configLocations = new String[] { "applicationContext.xml", "commonConcern.xml" };//여러개쓸거다하면 string배열로 갖고온다.
 ApplicationContext context = new GenericXmlApplicationContext(configLocations); //빈팩토리에 Application context
 WriteArticleService articleService = (WriteArticleService)  context.getBean("writeArticleService"); 
 articleService.write(new Article());
 }
}