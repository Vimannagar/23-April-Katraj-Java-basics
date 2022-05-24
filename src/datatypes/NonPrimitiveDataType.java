package datatypes;

public class NonPrimitiveDataType {

	public static void main(String[] args) {

		String s = "abc";

		System.out.println(s);
// '+' is known as concatenation operator when it is used with String
		String ss = s + "def";

		System.out.println(ss);// abcdef

		String ss2 = "ghi" + "jkl";

		System.out.println(ss2);

		int i = 56;

		String ss3 = s + 56;

		System.out.println(ss3);// abc56

		String ss4 = "100";

		String ss5 = ss4 + i;

		System.out.println(ss5);// 10056

		String ss6 = ss5 + true;

		System.out.println(ss6);// 10056true

		int j = 50;
// '+' is known as addition operator when it is used between numbers
		int k = i + j;
		System.out.println(k);// 106
		
		
		System.out.println("The sum of i and j is :"+k);//The sum of i and j is :106
		
		
		System.out.println("The sum of "+i+" and "+j+" is :"+k);//The sum of 56 and 50 is :106
		
		

	}

}
