package stringdiscussion;

public class MethodsInStringClass {

	public static void main(String[] args) {

//	1. equals(String s): 

		String s1 = "abc";

		String s2 = "abc";

		boolean s3 = s1.equals(s2);

		System.out.println(s3);// true

//	equalsIgnoreCase(String s)
		String s4 = "Pune";

		String s5 = "PUNE";

		boolean s6 = s4.equalsIgnoreCase(s5);

		System.out.println(s6);// true

//		length()

		String s7 = "Bhopal";

		int s8 = s7.length();

		System.out.println(s8);// 6

		String s9 = "I live in Mumbai";

		int s10 = s9.length();

		System.out.println(s10);// 16

//		charAt(int index)

		String s11 = "Hyderabad";

		char s12 = s11.charAt(8);

		System.out.println(s12);// d

//		WAP to print the reverse of the given String - Mumbai---> iabmuM

//		subString(int beginindex)

		String s13 = "Secunderabad";

		String s14 = s13.substring(5);

		System.out.println(s14);// derabad
		
//		subString(int beginindex, int endindex)
		
		
		String s15 = "Punecity";
		
		
		String s16 = s15.substring(2, 7);
		
		System.out.println(s16);//necit
		
//		WAP to print the characters of String which are present at even position
		
//		WAP to print all the characters of a String with their index position --> example: char c is at 0th position
		
//		WAP to print occurance of a character 'n' in a String- "Pennsylvania" 
		
//		toLowerCase():
		
		
		String s17 = "BaraMati";
		
		String s18 = s17.toLowerCase();
		
		System.out.println(s18);//baramati
		
//		toUpperCase():
		
		String s19 = "puNe";
		
		String s20 = s19.toUpperCase();
		
		System.out.println(s20);//PUNE
		
		
//	WAP to print occurance of a character 'p' in a String irrespective of their case- "Philippines"	
		
		
		
//	replace(char old, char new)
		
		
		String s21 = "Hyderabad";
		
		String s22 = s21.replace('H', 'h');
		
		System.out.println(s22);//hyderabad
		
		String s23 = "abcaabca";
		
		String s24 = s23.replace('a', 'z');
		
		System.out.println(s24);//zbczzbcz
		
// replace(String seq1, String seq2)
		
		String s25 = "Aurangabad";
		
		 String s26 = s25.replace("Auranga", "Osmana");
		
		System.out.println(s26);//Osmanabad
		
		
//		WAP to replace the space inside a string- "This is a String"
		
		
		
	}

}
