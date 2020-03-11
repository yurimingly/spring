package spring.chap01;

import org.springframework.stereotype.Component;

@Component//resource쓰면 이거 써야됨("articleDao")
public class MySQLArticleDao implements ArticleDao {

	public void insert(Article article) {
		System.out.println("MySQLArticleDao.insert() 실행");
	}

}