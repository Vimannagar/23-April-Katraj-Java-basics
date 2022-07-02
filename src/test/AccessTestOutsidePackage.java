package test;

import accessmodifiers.A;
import accessmodifiers.A1;
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
		
//		e.m2();
		
//		Accessing protected m1 method from A1 class
		A1 a1 = new A1();
		
//		a1.m1();-- Outside the package we cannot access the protected method directly if we  want to access then we have to call it inside the child class using child reference variable.
		
		System.out.println(a.i);
		
//		System.out.println(A.s);--since s is default hence we cannot access it outside the package
		
//		System.out.println(a1.d); outside the package protected can only be accessible inside the child class using child reference variable only.
	
		
		
	
	}

}
