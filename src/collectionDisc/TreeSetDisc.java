package collectionDisc;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDisc {
	
	public static void main(String[] args) {
TreeSet<String> city1 = new TreeSet<String>();
		
		city1.add("Patna");
		city1.add("Agra");
		city1.add("Mumbai");
		city1.add("Delhi");
		city1.add("Mumbai");
		city1.add("Bengaluru");
		
		
		System.out.println(city1);//[Agra, Bengaluru, Delhi, Mumbai, Patna]

	}

}
