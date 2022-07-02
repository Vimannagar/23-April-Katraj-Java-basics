package loops;

public class ReverseANumber {
	
	
	public static void main(String[] args) {
		int number = 12121;
		int i = 12121;
		
		int reverse = 0;
		while(i!=0)
		{
		
		
		
		int remainder = i%10;
		
		reverse = reverse*10 + remainder;
		
		i = i/10;
		
		
		}
		
		System.out.println(reverse);
		
		
		if(reverse == number)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}
		
		
		
				
		
	}

}
