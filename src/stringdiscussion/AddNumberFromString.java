package stringdiscussion;

public class AddNumberFromString {
	
	
	public static void main(String[] args) {
		
		String s = "hkjhdks56jsad80jsdflsk5dfkjd";
		String num = "";
		int sum=0;
		int flag = 0;
		for(int i=0; i<s.length();i++ )
		{
			if(Character.isDigit(s.charAt(i)))
			{
				num	= num +s.charAt(i);
			flag = 1;
				continue;
			}
		
			
			if(flag==1)
			{
			int value = Integer.parseInt(num);
			sum= sum+value;
			num = "";
			flag=0;
			}
		}
		
		System.out.println(sum);
		
		
//		*************************
//		swapping of two variable number without using third variable
		
		
		int a = 60;
		int b = 50;
		
		a = a+b;//110
		
		b = a-b;//60
		
		a = a-b;//50
		
		
		
		
		
		
		
		
	}

}
