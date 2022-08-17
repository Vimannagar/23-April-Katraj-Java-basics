package collectionDisc;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListDisc {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> ll  = new LinkedList<Integer>();
		
		
		ll.add(56);
		
		ll.add(58);
		ll.add(40);
		ll.add(2);
		ll.add(96);
		
		System.out.println(ll);
		
		Vector<Integer> v = new Vector<Integer>();//1.0v
		
		v.add(56);
		v.add(80);
		
		int initial = v.capacity();
		
		System.out.println(initial);
		LinkedList<Integer> l2  = new LinkedList<Integer>();
		
		
		
		
	}
	

}
