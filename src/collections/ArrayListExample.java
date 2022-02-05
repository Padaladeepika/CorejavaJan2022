package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arraylist1 = new ArrayList<String>();
		

		arraylist1.add("Deepika"); // 0 index
		arraylist1.add("DP"); // 1 index
		arraylist1.add("MANSA");// 2 index
		arraylist1.add("NAG"); // 3ndex
		
		
		System.out.println("The size of arraylist is" + arraylist1.size());
		System.out.println(arraylist1);
		
		System.out.println("The element at 0 index is "+ arraylist1.get(0));
		arraylist1.remove(0);
		
		
		System.out.println("The size of arraylist is" + arraylist1.size());
		System.out.println(arraylist1);
		
		arraylist1.set(1, "Padala"); // to replace the value of 1st position
		
		for(int index= 0;index<arraylist1.size();index++) {
			
			System.out.println(arraylist1.get(index));
		}
		
		for (String Name :arraylist1) {
			
			System.out.println(Name);
		
		
			}
			
		Iterator<String> itr = arraylist1.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next()) ;
			
			
		}
		
		// to sort the list( acsending order)
		
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		
		// to sort the list (descenig order)
		
		Collections.reverse(arraylist1);
		System.out.println(arraylist1);
		
		// dec
	
	
	
		

		
		
		
	}
	


}
