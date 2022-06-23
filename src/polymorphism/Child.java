package polymorphism;

public class Child extends Parent {
int i = 50;
	
static int y = 90;


	public void bike()
	{
		System.out.println("Bike method from Child class");
			
	}
		
public void marry()
	{
		System.out.println("marry method from child class");
	}
	
	public static void furniture()
	{
		System.out.println("Child class furniture method");
	}
	
	public static void m1()
	 {
		 System.out.println("m1 static method from child class");
	 }
	
	
	public static void main(String[] args) {
		Child c = new Child();
		
		c.home();//parent class home method
		
		c.car();// parent  class car method
		
		c.property();// parent class property method
		
		furniture();// parent class furniture method
	
		c.marry();//child class marry method
		
		System.out.println(c.i);// child class --50
		
	
		
		Parent p = new Parent ();
		p.marry();// parent class marry method
		
		System.out.println(p.i);// parent class i variable -- 20
		
		Parent pp = new Child();
		
		
		pp.marry();// child class marry method
		
		pp.car();// parent class car method
		
		pp.home();
		
		System.out.println(pp.i);// parent class i variable -- 20
		
//		Child cc = new Parent();// this is invalid object we can only have parent reference and child object but cannot have converse of it
		
		m1();// child class m1 method
		
		c.m1();// child class m1 method
		
		p.m1();// parent class m1 method
		
		pp.m1();// parent class m1 method i.e here overriding will not be applicable but method hiding will be applicable in short static doesnt follow overriding
		System.out.println(y);// child class --> 90
		
		System.out.println(c.y);// child class --> 90
		
		System.out.println(p.y);// parent class static variable -->80
		
		System.out.println(pp.y);// parent class static variable--> 80
	
		
	
	}
}
