package exceptionhandling;

public class ThrowKeyword {
	
	public static void main(String[] args)  {
		
		int i = 10;
		
		if(i>20)
		{
			throw new NullPointerException("Something went wrong please try after some time");
		}
		
		else
		{
			throw new ClassCastException("Something went wrong please try after some time");
		}
		
	}

}
