package collectionDisc;

import java.util.ArrayList;

public class ArrayListDisc {
	
	
	
	public static void main(String[] args) {
		
		
	ArrayList<String> al = new ArrayList<String>();
//	to add the value inside the arraylist
	
	al.add("Daniel");
	al.add("Eder");
	al.add("Diana");
	al.add("Doug");
	al.add("Cesar");
	
//	al.add(50);
//	
//	al.add('c');
//	
//	al.add(false);
	
	System.out.println("Printing before removing"+al);//Printing before removing[Daniel, 50, c, false]
	
	
//	to remove a value from arraylist
	
	al.remove("Daniel");
	
	System.out.println("Printing after removing"+al);//Printing after removing[50, c, false]
	
//	To update an index position value
	al.set(1, "first element");	
	
	
	System.out.println(al);
	
	System.out.println(al.get(2));	
	
//	to check if the value is available in the collection or not
boolean ispresent = al.contains("Daniel");

System.out.println(ispresent);



ArrayList<String> al2 = new ArrayList<String>();
al2.add("Delhi");
al2.add("Mumbai");
al2.add("Pune");


System.out.println(al2);//[Delhi, Mumbai, Pune, Eder, first element, Doug, Cesar]

//to check whether the content of one arraylist is present in other or not
boolean isallcontentpresent = al2.containsAll(al);

System.out.println(isallcontentpresent);
	
	
	
	
	
		
	}

}
