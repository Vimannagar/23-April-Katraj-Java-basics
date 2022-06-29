package casting;

public class Child extends Parent {

	public void m4() {
		System.out.println("m4 method from child class");
	}

	public static void main(String[] args) {

		Child c = new Child();

		Parent pp = (Parent) c;// UP casting

		pp.m1();
		pp.m2();
		
		Child ccccc = (Child)pp;// Down casting
		
		ccccc.m4();

		Parent p = new Child();

		p.m1();

		Parent p1 = new Parent();

		Child c1 = (Child) p1;// Down casting
		
		c1.m4();
		
		
		
		
		

	}

}
