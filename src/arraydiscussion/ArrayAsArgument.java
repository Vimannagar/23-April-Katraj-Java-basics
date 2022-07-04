package arraydiscussion;

public class ArrayAsArgument {
	
	public static void m1(int[] a)
	{
		a[0] = 10;
		
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		
		int [] f = new int[5];
		
		f[0] = 80;
		f[1] = 90;
		f[2]= 50;
		f[3] = 10;
		f[4] = 2; 
		
		m1(f);
		
	}

}
