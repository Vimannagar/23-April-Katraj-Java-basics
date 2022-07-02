package operators;

public class IncrementDecrementOperator {
	
	public static void main(String[] args) {
		
		int x= 10;
		
//		pre-increment: 
		
		int y= ++x;
		
		System.out.println(y);//11
		
		System.out.println(x);//11
		
//		post-increment: 	
		
		
		int w = 10;
		
		int z = w++;
		
		System.out.println(w);//11
		
		System.out.println(z);//10
		
		
//		pre-decrement:
		
		int q = 10;
		
		int p = --q;
		
		System.out.println(q);//9
		
		System.out.println(p);//9
		
//		post-decrement:
		
		
		int e = 10;
		
		int f = e--;
		
		System.out.println(e);//9
		
		System.out.println(f);//10
		
	}

}
