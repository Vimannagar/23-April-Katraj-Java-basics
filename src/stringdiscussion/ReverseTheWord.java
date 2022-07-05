package stringdiscussion;

public class ReverseTheWord {
	
	public static void main(String[] args) {
		
		String s = "This is my country";
		
		String [] splittedarray= s.split(" ");
		
		for(int i= 3; i>=0; i--)
		{
			System.out.print(splittedarray[i]+" ");//country my is This
			
		}
		
		
		
		
		
	}

}
