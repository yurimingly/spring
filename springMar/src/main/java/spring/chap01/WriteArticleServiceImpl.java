package spring.chap01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("writeArticleService")//resource쓰면 이거 써야됨("writeArticleService")
public class WriteArticleServiceImpl implements WriteArticleService { //상속관계 : 자손 implements 슈퍼클래스
	
	private ArticleDao articleDao; //해당 인터페이스를 구현하는 객체를 받아오겠다라는 뜻
	
	 @Autowired //resource쓰면 이름이 같은거 들고 오니까 밑에 mysqlArticle의 클래스이름을 가지고 와서 찾게됨 따라서 안됨
	 public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	 
	 public WriteArticleServiceImpl() {}
	 
	public WriteArticleServiceImpl(ArticleDao articleDao) {
	  this.articleDao = articleDao; //생성자를 통해서 주소값이 들어옴 
	  }
	 public void write(Article article) {
	  System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
	  articleDao.insert(article);
	 }
}