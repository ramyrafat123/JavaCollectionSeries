package listCharacterstics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
//		it simsilar to hashmap but it is synchronised
//		store the value on the basis of key-value
		
		Hashtable h1=new Hashtable();
		
		h1.put(1, "test1");
		h1.put(2, "test2");
		h1.put(3, "test3");
		
//		create a clone copy
		Hashtable h2=new Hashtable();
		
		h2=(Hashtable) h1.clone();
		System.out.println("the value of h1 " + h1);
		System.out.println("the value of h2 " + h2);
		
		h1.clear();
		System.out.println("the value of h1 " + h1);
		System.out.println("the value of h2 " + h2);
		
		h1.elements();
		

	}

}
