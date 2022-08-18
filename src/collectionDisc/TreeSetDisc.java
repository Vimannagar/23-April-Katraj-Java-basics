package collectionDisc;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDisc {
	
	public static void main(String[] args) {
TreeSet<String> city1 = new TreeSet<String>(new MyComp());
		
		city1.add("Patna");
		city1.add("Agra");
		city1.add("Mumbai");
		city1.add("Delhi");
		city1.add("Mumbai");
		city1.add("Bengaluru");
		
		
		System.out.println(city1);//[Agra, Bengaluru, Delhi, Mumbai, Patna]

		TreeSet<Integer> number = new TreeSet<Integer>();
		
		number.add(56);
		number.add(52);
		number.add(93);
		number.add(58);
		number.add(2);
		number.add(0);
		
		System.out.println(number);
	
		
		
	}

}
