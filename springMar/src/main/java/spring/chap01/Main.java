package spring.chap01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	//BeanFactory : 스프링컨테이너
public static void main(String[] args) {
 //Resource resource = new ClassPathResource("applicationContext.xml"); //ClassPathResource 는 *=src라는 뜻* : src에 있는 xml파일을 갖고 온다는 뜻
 ApplicationContext beanFactory /*BeanFactory beanFactory*/
 = new GenericXmlApplicationContext("applicationContext.xml"); /*new XmlBeanFactory(resource);*/
 
 WriteArticleService articleService = (WriteArticleService) beanFactory.getBean("writeArticleService");
 articleService.write(new Article());
 }
}