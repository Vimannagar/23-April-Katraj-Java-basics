package constructors;

public class College {
	
	
	String name;
	static String collegename = "coep";
	long mobile;
	int mathmarks;
	static String city = "pune";
	
	
	public College(String name, long mob, int mmarks)
	{
		mathmarks = mmarks;
		
		mobile= mob;
		
		this.name = name;
		
	}
	
	
	public static void main(String[] args) {
		
		College s1 = new College("Daniel", 9876543210l, 54);
		
		
		
		College s2 = new College("Eder", 1234567890l, 80);
		
		System.out.println(s1.name);
		
		System.out.println(s2.mathmarks);
		
		
	}
	
	

}
