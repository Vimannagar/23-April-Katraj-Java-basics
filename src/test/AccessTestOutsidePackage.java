package test;

import accessmodifiers.A;

public class AccessTestOutsidePackage {
	
	public static void main(String[] args) {
		A a = new A();
		
		a.m1();
		
		A.m2();
		
	}

}
