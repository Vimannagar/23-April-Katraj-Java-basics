package arraydiscussion;

public class DefinitionOfArray {
	
	public static void main(String[] args) {
		
//		First way to define the array:
		
		String [] s1 = new String[4];
		
		s1[0] = "Rohit";
		
		s1[1] = "Jadeja";
		
		s1[2] = "kohli";
		
		s1[3] = "Jadeja";
		
		s1[4] = "Jadeja";
		
		
		System.out.println(s1[2]);
		
		
		for(int i = 0; i<5; i++)
		{
			System.out.println(s1[i]);
		}
		
		int sizeofarray = s1.length;
		
		System.out.println(sizeofarray);
		
		for(int i=0; i<sizeofarray; i++)
		{
			System.out.println(s1[i]);
		}
		
		
		
		
		
		
		
	}

}
