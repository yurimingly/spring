package spring.chap01;

public class WriteArticleServiceImpl implements WriteArticleService { //상속관계 : 자손 implements 슈퍼클래스
	 private ArticleDao articleDao; //해당 인터페이스를 구현하는 객체를 받아오겠다라는 뜻
	 
	 public WriteArticleServiceImpl(ArticleDao articleDao) {
	  this.articleDao = articleDao; //생성자를 통해서 주소값이 들어옴 
	  }
	 public void write(Article article) {
	  System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
	  articleDao.insert(article);
	 }
}