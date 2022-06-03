package operators;

public class ComparativeOperator {
	
	public static void main(String[] args) {
		int i = 10;
				
		int j = 50;
		
		int l = 50;
//		1. equal operator
		
		boolean k = i==j;
		
		System.out.println(k);//false
		
		boolean n = j==l;
		
		System.out.println(n);// true
		
//		2. '>' greater than 
		
		boolean o = j>i;
		
		System.out.println(o);//true
		
//		3. '<' less than
		
		boolean p = i<j;
		
		System.out.println(p);//true
		
		
//		4. '>=' greater than or equals to 
		
		boolean q	= j>=i;

		System.out.println(q);//true
		
//		5. '<=' less tha or equals to
		
		boolean r	= j<=i;

		System.out.println(r);//false


		
		
	}

}
