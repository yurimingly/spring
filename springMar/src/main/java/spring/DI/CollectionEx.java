package spring.DI;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CollectionEx {
	
	List<Baz> list; //baz name a,b,c
	Map<String, String> map; //2
	Properties pro; //2
	
	public void setList(List<Baz> list) {
		this.list = list;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setPro(Properties pro) {
		this.pro = pro;
	}
	
	@Override
	public String toString() {
		return "CollectionEx [list=" + list + ", map=" + map + ", pro=" + pro + "]";
	}
	
	

}
