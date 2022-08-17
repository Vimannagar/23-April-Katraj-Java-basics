package arraydiscussion;

import java.util.Arrays;

public class MissingNumberFromArray {
	
	
	public static void main(String[] args) {
		
		int [] a = {6, 4, 2, 5, 1};
		
		
		Arrays.sort(a);//1, 2, 4, 5, 6
		
		for(int i=0; i<a.length; i++)
		{
			if(!(a[i]+1== a[i+1]))
			{
				System.out.println(a[i]+1);
				break;
				

			}
		}
		
		
		
		
		
		
	}
	

}
