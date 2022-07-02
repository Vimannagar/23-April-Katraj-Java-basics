package stringdiscussion;

public class SCPConcepti {
	
	public static void main(String[] args) {
		
		
		
		String ss1 = new String("abc");
		
		
		
		System.out.println(ss1);//abc
		
		String ss2 = new String("abc");
		
		String ss3 = new String("abc");
		
		String ss4 = new String("def");
		
		
		String s = "abc";
		
		String s1 = "jkl";
		
		String s2 = "jkl";
		
		
		
		boolean ispointingsameobject = s1==s2;
		
		System.out.println(ispointingsameobject);//true
		
		
		boolean ispointsame = ss1==s;
		
		System.out.println(ispointsame);//false
		
		
		
		// equals()
		
		boolean iscontentequal = s1.equals(s2);
		
		System.out.println(iscontentequal);
		
		
		boolean isequal = ss1.equals(s);
		
		System.out.println(isequal);//true
		
		boolean ispointsame2 = ss1==ss2;
		
		System.out.println(ispointsame2);//false
		
		
		
		
		
		
		
		
	}

}
