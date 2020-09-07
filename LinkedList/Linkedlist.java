package Collection;

import java.util.*;

public class Linkedlist {

	public static void main(String arg[]) {
//		//Decalation
//				List<Integer> ll = new LinkedList<Integer>(); // 1 way
//				
//				LinkedList<String> sl = new LinkedList<String>();// 2 way
//				
//		//Add		
//				sl.add("Jai");
//				sl.add("Shri");
//				sl.add("Ram");
//				sl.add("Ohm"); 
//				// adding at specific index		
//						long start = System.currentTimeMillis();  
//						for(int i=0; i< 10; i++) { 
//							
//							ll.add(0, i);
//						}
//						long end = System.currentTimeMillis();
//				System.out.println(ll);  
//						
//		//printing		
//				System.out.println(sl); 
//				
//				System.out.println( ( end - start )  + (" --->   Time taken")  );		// time comparison
//		//Remove
//				sl.remove();   			// eg-1  remove first element
//				System.out.println(sl);  
//				sl.remove("Shri");		// eg-2  remove given dat element, if exist
//				System.out.println(sl);
//				sl.remove(1);			// eg-3	remove index specific element
//
//		
//		
		SinglyLinkedList sList = new SinglyLinkedList(); 
		sList.add(1);
		sList.add(2);	
		sList.add(22);
		sList.add(21);
		sList.add(25);
		sList.add(29);
		sList.display();
	}
}
