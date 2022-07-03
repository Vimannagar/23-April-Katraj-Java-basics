package stringdiscussion;

public class PrintCharAtEvenPosition {
	
	
	public static void main(String[] args) {
		
		String s = "Gandhinagar";
		
		for(int i=0; i<s.length(); i++)
		{
			if(i%2==0)
			{
				char c = s.charAt(i);
				
				System.out.println(c);
			}
		}
		
	}

}
