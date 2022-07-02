package operators;

public class EvenOddDetection {
	

	
	public static void evenOrOdd(int i)
	{
		if(i%2==0)
		{
			System.out.println(i + " is an even number");
		}
		else
		{
			System.out.println(i+" is an odd number");
		}
	}
	
	
	public static void main(String[] args) {
		evenOrOdd(26);
	}
}
