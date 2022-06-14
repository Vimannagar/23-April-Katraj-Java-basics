package test;

import accessmodifiers.A;
import accessmodifiers.E;


public class AccessTestOutsidePackage {
	
	public static void main(String[] args) {
//		Accessing public class A
		A a = new A();
		
		a.m1();
		
		A.m2();
		
////Accessing default class B	
//		
//		B b = new B();--> B class is default hence it will not be accessible here i.e outside the package.
		
//		
//		b.m2();
//		
		
//		Accessing the public class E and public method
		

		E e = new E();
		
		e.m1();
		
		e.m2();
		
		
		
	}

}
