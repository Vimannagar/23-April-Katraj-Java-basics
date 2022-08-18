package collectionDisc;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapDisc {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		
		hm.put(101, "Delhi");
		hm.put(506, "Mumbai");
		hm.put(702, "Chennai");
		hm.put(201, "Pune");
		hm.put(702, "Latur");
		
		System.out.println(hm);
		
		
		
		

		TreeMap<Integer, String> hm1 = new TreeMap<Integer, String>();
		
		
		hm1.put(101, "Delhi");
		hm1.put(506, "Mumbai");
		hm1.put(702, "Chennai");
		hm1.put(201, "Mumbai");
		hm1.put(685, "Latur");
		
		System.out.println(hm1);
		
	}

}
