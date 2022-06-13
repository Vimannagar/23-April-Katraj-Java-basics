package accessmodifiers;

public class AccessTestInSamePackage {
	
	public static void main(String[] args) {
		
		A a = new A();
		
		a.m1();
		
		A.m2();
		
		
	}

}
