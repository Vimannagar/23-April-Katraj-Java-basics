package variables;

public class ThisKeyword {
	
	static String s = "abc";
	int i = 10;
	
	int j = 90;
	
	public static void main(String[] args) {
		int i = 50;
		
		System.out.println(i);//50
		
		ThisKeyword tk = new ThisKeyword();
		
		System.out.println(tk.i);//10
		
	
		
	}
	
	public void m1()
	{
		int j = 40;
		
		String s = "jkl";
		System.out.println(j);//40
		
		System.out.println(this.j);//90
		
		System.out.println(s);//jkl
		
		System.out.println(this.s);//abc- using of this keyword to access static variable is not recommended
		
		System.out.println(ThisKeyword.s);//abc
	}

}
