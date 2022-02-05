package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Deep:");
		set1.add("nag");
		set1.add("Mana");
		set1.add(null);
		
		System.out.println(set1);
		
		

		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		
		set2.add("Deep:");
		set2.add("nag");
		set2.add("Mana");
		set2.add(null);
		
		
		System.out.println(set2);
		
TreeSet<String> set3 = new TreeSet<String>();
		
set3.add("Deep:");
set3.add("nag");
set3.add("Mana");
//set3.add(null);cannot add null in tree set
		
		System.out.println(set3);
		
		
		String str1 = "Clean Wolrd Green Wolrd";
	
		HashSet<String> str11 = new HashSet<String>();
		
		
		str11.add("Clean:");
		str11.add("Wolrd");
		str11.add("Green");
		str11.add("Wolrd");
		
		System.out.println(str11);
		
		

	}

}
