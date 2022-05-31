package listCharacterstics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		
//		linkedlist is contain three parts head/data/next
//		1-head the pointer of the first data in linkedlist 
//		2-data store the data of linkedlist
//		3-next :is the second part of linkedlist store the reference of the next element not previous
//		....so it called singly linkedlist 
		
//		Store String values in linkedlist

		LinkedList<String> linkedlistString=new LinkedList<String>();
		
//		add values
		
		linkedlistString.add("test1");
		linkedlistString.add("test2");
		linkedlistString.add("test3");
		
//		print
		
		System.out.println("Display the content of LinkedlistString: "+linkedlistString);
		
//		add first
		linkedlistString.addFirst("test0");
		System.out.println(linkedlistString);
		
//		add last
		linkedlistString.addLast("test4");
		System.out.println(linkedlistString);
		
//		get value
		System.out.println(linkedlistString.get(0));
		
//		set value
		linkedlistString.set(0, "ramy");
		System.out.println(linkedlistString);
		
//		for loop
		for (int i = 0; i < linkedlistString.size(); i++) {
			
			System.out.println(linkedlistString.get(i));
			
		}
		
		
//		advanced loop
		
		for (String string : linkedlistString) {
			
			System.out.println(string);
			
		}
		
		
//		iterator
		for (Iterator iterator = linkedlistString.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		
		
		
	}

}
