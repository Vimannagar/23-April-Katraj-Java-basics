package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("E:\\desktop\\sadgsajgdhs\\23 April\\Automation Testing.docx");
		
		System.out.println("After locating the file");
		
	}

}
