package variables;

public class Test {

	static int i = 50;
	
	int j = 20;
	
	String k = "Daniel";
	
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		System.out.println(t.j);//20
		
		
		Test t1 = new Test();
		t.j = 90;
		
		System.out.println(t.j);//90
		
		System.out.println(t1.j);//20
		
		
		System.out.println(t1.k);//Daniel
		
		t1.k= "Eder";
		
		System.out.println(t.k);//Daniel
		
		
		System.out.println(i);//50
		
		System.out.println(t.i);//50
		
		t.i = 60;
		
		
		System.out.println(t1.i);//60
		
		System.out.println(i);//60
		
		t1.i = 45;
		
		System.out.println(t1.i);//45
		
		System.out.println(t.i);//45
		
		System.out.println(i);//45
		
	}
	
}
