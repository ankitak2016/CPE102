

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Explore {
	public static void main(String args[]){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(new Integer(4));
		list.add(new Integer(7));
		list.add(new Integer(19));
		list.add(new Integer(12));
		for(Integer in : list){
			System.out.print(in+" ");
		}
		System.out.println();
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("A");
		linkedlist.add("B");
		linkedlist.add("C");
		linkedlist.add("D");
		Iterator<String> iter =linkedlist.iterator();;
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
	}
}
	
