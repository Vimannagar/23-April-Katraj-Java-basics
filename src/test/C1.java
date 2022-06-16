package test;

public class C1 extends B1{
	
	public static void main(String[] args) {

//		B1 b1 = new B1();
//		
//		b1.m1();--> this will show error as B1 is not child class here.
		
		C1 c1= new C1();
		
		c1.m1();
		
		
		System.out.println(c1.d);
	}

}
