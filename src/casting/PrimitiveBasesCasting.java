package casting;

public class PrimitiveBasesCasting {

	public static void main(String[] args) {

//		implicit casting:--> Widening of data type

		short s = 561;

		int i = (int) s;

		System.out.println(i);//561

		byte b = 10;

		long l = (long) b;

		System.out.println(l);//10

//		explicit casting:--> Narrowing of data type

		int k = 140;

		byte p = (byte) k;

		System.out.println(p);//-116

	}

}
