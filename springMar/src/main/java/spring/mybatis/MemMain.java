package spring.mybatis;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemMain {
public static void main(String[] args) {
	//context컨테이너 만들고
	ApplicationContext context
	=new GenericXmlApplicationContext("mybatisTest.xml");
	
	//dao에 있는 bean을 get해왔다.
	MemDao dao = context.getBean("dao", MemDao.class);
	
	//dao의 List<MemDto> getAll(){}를 MemDto의 all 객체에 넣어준다 
	List<MemDto> all= dao.getAll();
	
	System.out.println(all);
	
	
}


}


/*
 * properties지우고
 *  setting남기고 
 *  enviornman지우고
 *   매퍼지우고
 */