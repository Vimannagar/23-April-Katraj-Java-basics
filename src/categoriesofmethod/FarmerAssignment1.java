package categoriesofmethod;

public class FarmerAssignment1 {
	
	public static int areaCalculator()
	{
		int length = 50;
		int breadth = 20;
		int area = length * breadth;
		
		return area;
		
	}
	
	public static int areaCalculator2()
	{
		int length = 10;
		int breadth = 15;
		int area = length * breadth;
		
		return area;
		
	}
	
	public static int areaCalculator3()
	{
		int length = 40;
		int breadth = 60;
		int area = length * breadth;
		
		return area;
		
	}
	
	public static void main(String[] args) {
		
		int area1 = areaCalculator();
		
		int area2 =	areaCalculator2();
		
		int area3 =	areaCalculator3();
		
		
		int totalarea =area1 +area2 + area3;
		
		System.out.println(totalarea);
		
	}

}
