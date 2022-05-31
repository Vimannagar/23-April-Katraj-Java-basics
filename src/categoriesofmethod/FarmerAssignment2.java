package categoriesofmethod;

public class FarmerAssignment2 {
	
	public static int areaCalculator(int length, int breadth)
	{
		
		int area = length * breadth;
		
		return area;
		
	}
	
	public static void main(String[] args) {
		int area1 = areaCalculator(50, 10);
		
		System.out.println(area1);
		
		System.out.println(areaCalculator(50, 10));
		
		int area2 = areaCalculator(10, 20);
		
		int area3 = areaCalculator(40, 60);
		
		int totalarea = area1 +area2 +area3;
		
		
		System.out.println(totalarea);
		
	}

}
