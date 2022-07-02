package operators;

public class LogicalOperators {

	public static void main(String[] args) {

		// Logical AND operator -- > &&

		int i = 10;

		boolean j = i >= 5;

		boolean k = i == 10;

		boolean l = j && k;

		System.out.println(l);// true

//		Logical OR operator: --> ||

		boolean y = i == 5;

		boolean z = i >= 10;

		boolean w = y || z;

		System.out.println(w);// true
	
// NOT - Logical NOT operator--> !
		
		int h= 50;
		
		
		boolean m = h>50;
		
		System.out.println(m);//false
		
		boolean n = !m;
		
		System.out.println(n);//true
		
		
		boolean o = !(i>=50);
		
		
		System.out.println(o);// true
		
	boolean	u = i!=50;
	
	System.out.println(u);// true
		
		
	
//	WAP to find the range in which number lies
	
//	0-20 --> between 0 and 20
//		
//	21-40 --> between 21 and 40	
//	
//	41-60 --> between 40 and 60
//	
//	>100 --> beyond 100
		
		
		
	}

}
