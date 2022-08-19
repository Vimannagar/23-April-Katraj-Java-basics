package stringdiscussion;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class CountDuplicateCharactersFromString {
	
	public static void main(String[] args) {
		
		
		String s = "communittee";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		
		for(int i=0; i<s.length(); i++)
		{
			
			char charvalue = s.charAt(i);
			
			if(hm.containsKey(charvalue))
			{
				hm.put(charvalue, hm.get(charvalue)+1);
			}
			
			else
			{
				hm.put(charvalue, 1);
			}
			
			
		}
		
		System.out.println(hm);
		
		
		Set<Entry<Character, Integer>> kv = hm.entrySet();
		
		for(Entry<Character, Integer> keyvalue:kv)
			
		{
			Character key = keyvalue.getKey();
			Integer valu = keyvalue.getValue();
			System.out.println("Character "+key+" is repeating "+valu+" times in String");
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
