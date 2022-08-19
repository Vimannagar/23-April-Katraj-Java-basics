package stringdiscussion;

public class RemoveSpaceInbetweenString {
	
	public static void main(String[] args) {
		String s = "This   is a    String";
		String str= "";
		
		for(int i=0; i<s.length(); i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)==' '))
		{
			continue;
		}
		else
		{
			str = str+s.charAt(i);
		}
		}
		
		System.out.println(str);
		
	
		
		
	}

}
