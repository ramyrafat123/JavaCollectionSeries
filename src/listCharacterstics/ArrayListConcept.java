package listCharacterstics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
//		static array it's mean fixed size such as example
//		so we can't use static array in dynamic application or framework
		
		int a[]=new int[5];
		
//		so we use ArrayList (dynamic array)
//		in case ArrayList at anytime you add value the size will increase
//		ArrayList is class so i can create object of it 
//		synchronized it's mean not work like thread so it's slow 
		
		ArrayList arraylist=new ArrayList();
		
//		can add dynamic values
		
		arraylist.add(20); //Stored in 0 position
		arraylist.add(30); //Stored in 1 position
		arraylist.add(40); //Stored in 2 position
		
//		Display size of ArrayList
		
		System.out.println(arraylist.size());
		
//		add values in Arraylist again
		
		arraylist.add(50); //Stored in 3 position
		arraylist.add(60); //Stored in 4 position
		arraylist.add(70); //Stored in 5 position
		
//		Display size of ArrayList
		
		System.out.println(arraylist.size());
		
		
//		Characteristics:
		
//		1-Arraylist allow random access
		System.out.println(arraylist.get(2));
		
		
//		print values of arraylist 
		
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
			
		}
		
//		generic :what kind of value do you want to define arraylist with it
//		can store different kind of values
		
		arraylist.add("ramy rafat");
		arraylist.add(1000000);
		arraylist.add(3.14);
		arraylist.add(false);
		arraylist.add(true);
		
//		1-define ArrayList to store only integer values
		
		ArrayList<Integer> arraylistint =new ArrayList<Integer>();
		
//		only add integer for this object of ArrayList
		
		arraylistint.add(20);
		
		System.out.println(arraylistint.get(0));
		
		
//		2-define ArrayList to store only String values
		
		ArrayList<String> arraylistString =new ArrayList<String>();
		
//		only add integer for this object of ArrayList
		
		
		arraylistString.add("test1");
		arraylistString.add("test2");
		arraylistString.add("ramy rafat");
		
		
		System.out.println(arraylistint.get(0));
		
		
//		could also store object such as example
		
//		create object of class Employee
		
		Employee employee1 =new Employee("ramy", 28, "Engineering");
		Employee employee2 =new Employee("Ahmed", 29, "Engineering");
		Employee employee3 =new Employee("Mohamed", 30, "Engineering");
		
//		create ArrayList:
		
		ArrayList<Employee> arraylistemployee=new ArrayList<Employee>();
		
		arraylistemployee.add(employee1);
		arraylistemployee.add(employee2);
		arraylistemployee.add(employee3);
		
//		iterator to reverse values
		
		 Iterator<Employee> it=arraylistemployee.iterator();
		 
		 while (it.hasNext()) {
			 
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.Department);
		}
		 
		 
		 for (Iterator iterator = arraylistemployee.iterator(); iterator.hasNext();) {
			Employee empl = (Employee) iterator.next();
			System.out.println(empl.name);
			System.out.println(empl.age);
			System.out.println(empl.Department);
			
			
		}
		 
		 
//		 add list in another list of same type
		 
		 ArrayList<String> arr1=new ArrayList<String>();
		
		 arr1.add("ramy");
		 arr1.add("Ahmed");
		 arr1.add("Mohamed");
		 
		 
		 ArrayList<String> arr2=new ArrayList<String>();
		
		 arr2.add("Shadi");
		 arr2.add("Samir");
		 arr2.add("Mahmoud");
		 
		 arr1.addAll(arr2);
		 
//		 Display values in arr2
		 
		 for (Iterator iterator = arr1.iterator(); iterator.hasNext();) {
			String arrrr = (String) iterator.next();
			System.out.println(arrrr);
			
		}
		 
		 for (int i = 0; i < arr1.size(); i++) {
			 
			 System.out.println(arr1.get(i));
			
		}
		 
		 
 
		
		
		
		
		
		
		
		
	
		
		

	}

}
