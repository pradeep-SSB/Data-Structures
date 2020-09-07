package Collection;

//javatpoint

public class SinglyLinkedList {

 //Represent a node of the singly linked list  
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=  data;
			this.next =null;
		}
	}
//Represent the head and tail of the singly linked list    
	Node head =null;
	Node  tail= null;
//addNode() will add a new node to the list//Add
	 void add(int data) {
//Create a new node 
		Node newNode = new Node(data);
//If list is empty, both head and tail will point to new node   		
		if(head == null)
		{		
			head = newNode;
			tail= newNode;
		}
		
		else {
//newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode;
			tail= newNode;
	}	
	 	}
	 
//Display
	 public  void display() {
//Node current will point to head  
		 Node current = head;
		 		 
		 while(current != null) {  // Key
			 System.out.println( current.data +" ");
			 current= current.next;
		 }
	 } 

}







