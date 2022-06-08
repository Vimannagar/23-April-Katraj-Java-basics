package loops;

public class BreakKeyword {
	
	public static void main(String[] args) {
		for(int j = 0; j<=5; j++)
		{
		for(int i =1; i<=10; i++)
		{
			
			System.out.println(i);
			if(i>5)
			{
				break;
			}
		}
		System.out.println("outside the innerloop");
		}
		
	}

}
