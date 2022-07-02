package stringdiscussion;

public class ImmutableConcept {

	
	
public static void main(String[] args) {
	
	
	
	String s = "abc";
	
	s.concat("def");
	
	System.out.println(s);//abc//immutable
	
	
	
	StringBuffer sb = new StringBuffer("xyz");
	
	sb.append("tuv");
	
	System.out.println(sb);//xyztuv//mutable
	
}
}
