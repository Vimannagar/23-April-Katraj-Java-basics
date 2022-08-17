package collectionDisc;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionBetweenArrayAndList {
	
	public static void main(String[] args) {
//		Array to arraylist conversion
		
		String [] s = {"aaa", "bbb", "ccc"};
		
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
		
		System.out.println(al);//["aaa", "bbb", "ccc"]
		
		
//		ArrayList to array conversion
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		
		int length = al2.size();
		
		System.out.println(length);
		
		
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(60);
		
		
		int postlength = al2.size();
		
		System.out.println(postlength);
		
		Integer [] a = new Integer[al2.size()];

		al2.toArray(a);
		
		for(int aa:a)
		{
			System.out.println(aa);
		}
		
		
		
		
		
		
		
	}

}
