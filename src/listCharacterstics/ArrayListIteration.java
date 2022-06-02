package listCharacterstics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		
		ArrayList<String> tvSeries=new ArrayList<String>();
		tvSeries.add("Game of thrones");
		tvSeries.add("Breaking bad");
		tvSeries.add("The big bang theory");
		tvSeries.add("the walking dead");
		tvSeries.add("prison Break");
		
//		1-iterate using for each loop and lambda
		
		tvSeries.forEach(show -> {
			System.out.println(show);
		});
		
//		2-Iterator		
		
		Iterator<String> it=tvSeries.iterator();
		while (it.hasNext()) {
			String showss=it.next();
			System.out.println(showss);
			
		}
		
		
//		3-using iterato and forEachRemaning() method
		
		
		

	}
	
	

	
	

}
