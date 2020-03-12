package spring.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class MemDao extends SqlSessionDaoSupport{
	
	/*
	 * SqlSession session;
	 * 
	 * public void setSession(SqlSession session) { this.session = session; }
	 */
	
	public List<MemDto> getAll(){
		//return session.selectList("member.allMember");
		return getSqlSession().selectList("member.allMember");
	}

}
