package categoriesofmethod;

public class WithReturnAndWithArg {
	
	public static String m1(String name, int roll)
	{
		System.out.println("with return and with arg");
		
		String uniqueid = name+roll;
		
		return uniqueid;
	}

	
	public static void main(String[] args) {
	String value	= m1("Eder", 50);
	
	System.out.println(value);
	String val2= value+"pune";
	
	System.out.println(val2);
	
	
	
	
	}
}
