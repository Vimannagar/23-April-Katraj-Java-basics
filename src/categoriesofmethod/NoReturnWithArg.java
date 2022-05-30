package categoriesofmethod;

public class NoReturnWithArg {
	
	public static void m1(int i)
	{
		System.out.println("m1 method");
		
		int j	= i+2;
	
		System.out.println("The value of j is: "+j);
	}
	
	
	public void m2(int a, int b)
	{
		int c = a+b;
//		The sum of value1 and value2 is : output---> assignment
		System.out.println("The sum is :"+c);
	}
	
	public static void main(String[] args) {
		
		m1(80);
		
		m1(56);
		
		NoReturnWithArg nrwa = new NoReturnWithArg();
		
		nrwa.m2(50, 10);
		
		nrwa.m2(4508, 5685);
	}

}
