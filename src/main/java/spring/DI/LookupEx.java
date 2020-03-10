package spring.DI;

public class LookupEx {
	
	Baz baz;
	
	public Baz getBaz() {
		return null;
	}
	
	public void doLookupEx() {
		baz=getBaz();
		baz.doBaz();
	}

}
