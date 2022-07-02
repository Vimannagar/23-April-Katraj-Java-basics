package exceptionhandling;

public class CustomizeException {
	
	public static void main(String[] args) {
		
	String day = "Saturday";
	
	
	if(day=="Saturday")
	{
		throw new TodayNoClassException("Aaj class nahiye udya join kara");
	}
	
	System.out.println("Today we have a class please join");
		
	}

}
