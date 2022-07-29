package arraydiscussion;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 20;
		a[1] = 80;
		a[2] = 200;
		a[3] = 5;
		a[4] = 7;

		Arrays.sort(a);

		for (int aa : a) {
			System.out.println(aa);
		}
		
		System.out.println(a[a.length-2]);
		
		int g = 50;
		int k = 60;
		
		int temp;
		
		temp = k;
		
		k=g;
		g=temp;

	}
	
//	WAP to find the second largest number from an array

}
