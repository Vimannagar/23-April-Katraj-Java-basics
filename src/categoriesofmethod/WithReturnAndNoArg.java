package categoriesofmethod;

public class WithReturnAndNoArg {
	
	public static int m1()
	{
		int i = 50;
		int j = 41;
		 
		int k = i-j;
		
		System.out.println(k);
		return k;
	}
	
	
	public static String m2()
	{
		String s1 = "abc";
		String s2 = "def";
		
		String s3 = s1+s2;
		
		return s3;
		
	}
	
	
	public static void main(String[] args) {
		int l = m1();
		
		int m = l-4;
		
		System.out.println(m);//5
		
		String s4 = m2();
		
		String s5= s4+"jkl";
		
		System.out.println(s5);//abcdefjkl
	}
	

}
