package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test5 {
	
		public static void main(String[] args) throws FileNotFoundException, InterruptedException 
		{
			
			
			FileInputStream fis  = new FileInputStream("c://Desktop//abc.docx");
			
			
			
			System.out.println("After locating file");
			
		}

}
