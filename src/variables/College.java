package variables;

public class College {
	
//	name		---> String ---> non static
//	collegename ---> String ---> static 
//	mobilenumber---> int	---> non static
//	mathsmarks  ---> int 	---> non static
//	city		---> String ---> static
	
	String name;
	static String collegename = "coep";
	long mobile;
	int mathmarks;
	static String city = "pune";
	public static void main(String[] args) {
		
		College s1 = new College();
		
		s1.name = "Daniel";
		
		s1.mobile = 9876543210l;
		
		s1.mathmarks = 60;
		
		
		College s2 = new College();
		
		s2.name = "Eder";
		
		s2.mobile = 1234567890l;
		
		s2.mathmarks = 40;
		
		
		
		System.out.println(s2.mathmarks);
		
		System.out.println(s1.collegename);
		
		
		
		
	}
	
	
	

}
