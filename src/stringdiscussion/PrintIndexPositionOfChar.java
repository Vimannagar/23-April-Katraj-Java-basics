package stringdiscussion;

public class PrintIndexPositionOfChar {
	
	public static void main(String[] args) {
		String s = "Delhi";
		
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			
			if(c=='h' || c=='i')
			{
			
			System.out.println("Character "+c+" is at "+i+"th position");
			
			}
		}
		
	}

}
