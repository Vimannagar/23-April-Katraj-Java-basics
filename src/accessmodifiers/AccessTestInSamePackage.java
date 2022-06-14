package accessmodifiers;

public class AccessTestInSamePackage {
	
	public static void main(String[] args) {
//		Accessing public class A
		A a = new A();
		
		a.m1();// Accessing the public method inside the same package
		
		A.m2();
//Accessing default class B
		
		B b = new B();
		
		b.m2();
		
//Accessing the public class and public method		
		E e = new E();
		
		e.m1();
		
//		Accessing the default method and public class
		
		e.m2();
		
//		e.m3();	- m3 method from E class is private hence it will only be accessible inside the same class but not outside the class
		
		
	}

}
