package exceptionhandling;

public class MultiCatch {
	
	public static void main(String[] args) {
		
		
		try {
		int i = 100;
		
		int j =0;
		
		System.out.println("before division line");
		int k = i/j;
		
		System.out.println("After division line");
		
		System.out.println(k);
		
		}
	
		
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception");
		}
		
		catch(ClassCastException e)
		{
			System.out.println("Class cast exception");
		}
		
		catch(Exception a)
		{
			System.out.println(" exception catch block");
		}
		
		
		
	}

}
