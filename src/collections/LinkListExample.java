package collections;

import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    LinkedList<String> list1 = new LinkedList<String>();
		
              list1.add("Deepika"); // 0 index
               list1.add("DP"); // 1 index
              list1.add("MANSA");// 2 index
             list1.add("NAG"); // 3ndex

            System.out.println(list1);


for(int index= 0;index<list1.size();index++) {
	
	System.out.println(list1.get(index));
	
	list1.add(2,"Bharat");
    System.out.println(list1);
}
	}

}
