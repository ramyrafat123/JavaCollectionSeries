package listCharacterstics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
//		HashMap is a class implements Map Interface
//		Store data in <key,value>
		
//		Example of Map:
//		1-Error codes(1.2.1 :"fatel error")
//		2-map of zip codes
//		3-map of managers and employee
//		4-test data storage
//		5-configuration/environment variables
//		6-headers in rest api
		
//		it contains only unique element
//		hashmap is non-synchronised/fast performance system 
		
		HashMap<Integer, String> hashmap1=new HashMap<Integer, String>();
		hashmap1.put(1, "test1");
		hashmap1.put(2, "test2");
		
//		display value
		System.out.println(hashmap1.get(1)); 
		
//		iterate	
	for (Entry<Integer, String> m : hashmap1.entrySet()) {
		System.out.println(m.getKey() +" "+m.getValue());
	}
	
//	hashmap add number for each employee
	
	HashMap<Integer, Employee> hashmapemployee =new HashMap<Integer, Employee>();
	Employee emp1 =new Employee("ramy", 28, "QA");
	Employee emp2 =new Employee("ahmed", 29, "QA");
	Employee emp3 =new Employee("mohamed", 28, "QA");
	
//	add values of each employee
	hashmapemployee.put(1, emp1);
	hashmapemployee.put(2, emp2);
	hashmapemployee.put(3, emp3);
	
//	iterate in hashnmap
	for(Entry emp : hashmapemployee.entrySet()) {
		
		int e=(int) emp.getKey();
		Employee em=(Employee) emp.getValue();
		System.out.println(em.name +" "+em.age+" "+em.Department);

	}
	
//	create hashtable
	Hashtable st=new Hashtable();
	
//	put key and value
	
	st.put(1, "ramy");
	st.put(2, "tamer");
	st.put(3, "samir");
	
	System.out.println(st.get(1));
	
	
	
	
	
	}
}
