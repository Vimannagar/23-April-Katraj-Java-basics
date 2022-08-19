package collectionDisc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MethodsOfHashMap {
	
	public static void main(String[] args) {
		
		
HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		
		hm.put(101, "Delhi");
		hm.put(900, "Mumbai");
		hm.put(702, "Chennai");
		hm.put(201, "Pune");
		hm.put(800, "Latur");
		
		System.out.println(hm);
// To get all the values		
	Collection<String> val = hm.values();
	
	
	System.out.println(val);
	
//	To get all the keys
	Set<Integer> keys = hm.keySet();
	
	System.out.println(keys);
	
	
//	 To check the key is available inside the map or not
	boolean iskeypresent = hm.containsKey(000);
	
	System.out.println(iskeypresent);
	
	
	boolean isvaluepresent = hm.containsValue("Chennai");
	
	System.out.println(isvaluepresent);
	
//To remove the value from the hashmap	
	hm.remove(900);
	
	System.out.println(hm);
	
	
//	To get a value from a key 
	String value = hm.get(201);
	
	System.out.println(value);

//	WAP to count the duplicate characters inside the String - "communitee"
	
	Set<Entry<Integer, String>> kv = hm.entrySet();
	
	for(Entry<Integer, String> keyvalue:kv)
		
	{
		Integer key = keyvalue.getKey();
		System.out.println(key);
		
		String valu = keyvalue.getValue();
		System.out.println(valu);
	}
	
	
	
//	WAP to count the pattern is comming inside the String
	
	String s = "abcahfkahfksabckjfdsfhsdjabcjdshfk";
	
	
	}

}
