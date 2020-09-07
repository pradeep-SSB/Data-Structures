package Collection;

//import org.w3c.dom.Node;

public class SinglyLinkedList {
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=  data;
			this.next =null;
		}
	}
	
	Node head =null;
	Node  tail= null;
//Add
	 void add(int data) {
		Node newNode = new Node(data);
		
		if(head == null)
		{		
			head = newNode;
			tail= newNode;
		}
		
		else {
			tail.next = newNode;
			tail= newNode;
	}	
	 	}
	 
//Display
	 public  void display() {
		 Node current = head;
		 		 
		 while(current.next != null) {
			 System.out.println( current.data +" ");
//			 current= current.next;
		 }
	 } 

}







