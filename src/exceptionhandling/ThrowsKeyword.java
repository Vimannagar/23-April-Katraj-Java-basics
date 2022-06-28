package exceptionhandling;

public class ThrowsKeyword {
	
	
	public static void main(String[] args) throws ArithmeticException
	
	{
		int i = 100;
		
		int j =0;
		
		System.out.println("before division line");
		int k = i/j;
		
		System.out.println("After division line");
		
		System.out.println(k);
	}

}
