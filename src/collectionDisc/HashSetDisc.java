package collectionDisc;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDisc {
	
	
	public static void main(String[] args) {
		
		
		HashSet<Character> hs = new HashSet<Character>();
		
		hs.add('a');
		hs.add('b');
		hs.add('t');
		hs.add('d');
		hs.add('d');
		hs.add('b');
		hs.add('z');
		hs.add(null);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);//[a, b, t, d, z]
		
		
		
		HashSet<String> city = new HashSet<String>();
		
		city.add("Patna");
		city.add("Agra");
		city.add("Delhi");
		city.add("Mumbai");
		city.add("Bengaluru");
		
		System.out.println(city);//[Delhi, Patna, Bengaluru, Agra, Mumbai]
		
		
		
		LinkedHashSet<String> city1 = new LinkedHashSet<String>();
		
		city1.add("Patna");
		city1.add("Agra");
		city1.add("Mumbai");
		city1.add("Delhi");
		city1.add("Mumbai");
		city1.add("Bengaluru");
		
		
		System.out.println(city1);//[Patna, Agra, Mumbai, Delhi, Bengaluru]

		
		
	}

}
