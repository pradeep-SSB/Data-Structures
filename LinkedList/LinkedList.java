import javax.lang.model.util.ElementScanner6;

public class LinkedList{

    public static class Node{  // class Node
        int data;
        Node next;
    }

    public static class LL{    // class LinkedList
        Node head;
        Node tail;
        int size;

       void addlast(int val){
        Node temp = new Node(); //  each time new node create krna hoga 
        temp.data = val;        //common code - when size = 0 size != 0
        temp.next = null;
           
        if(size == 0){  // empty ll
            // Node temp = new Node();
            // temp.data = val;
            // temp.next = null;

            head = tail = temp;   
        }
        else{
            // Node temp = new Node();
            // temp.data = val;
            // temp.next = null;
            tail.next = temp;
            tail= temp;
        }
        size++;
        }

        void display(){
            Node temp = head;       // temp variable ko lekr move krayenge

            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
              
            }
        int size(){
            return size;
        }

        void removefirst(){
            if(size == 0)
                System.out.println("List s empty");

            else if(size == 1)
                head =  tail = null;
            
            else {
                head = head.next;
                size--;
            }                   
        }

        int getFirst(){
            if(size == 0){
                System.out.println("Empty List");
                return -1;
            }else
            return head.data;

        }
        int getLast(){
            if(size == 0){
                System.out.println("Empty List");
                return -1;
            }else
            return tail.data;
        }

        int getAt(int idx){
            if(size == 0){
                System.out.println("Empty List");
                return -1;
            }
            else if(idx  < 0 || idx >= size ){
                System.out.println("Invalid Argument");
                return -1;
            }
            else{
                Node temp = head;
                for(int i = 0 ; i < idx ; i++){
                    temp  = temp.next;
                }
                return temp.data;
            }
        }
        void addFirst(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if(size == 0){
                tail =  temp;
          }
            size++;   
        }
       void addAt(int val, int idx){
           Node node = new Node();
           node.data = val;

            if(idx < 0 || idx > size){                       // Invalid index
               System.out.println("Invalid Arguments");
           }
             else if(idx == 0)                // starting
                addFirst(val);
            else if(idx == size )                // End
                addlast(val);
  
            else{
            Node temp = head;    // in between
            for(int i = 0; i < idx - 1; i++){  // key -> i < idx - 1;
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
       }
      void removeLast(){
        if(size == 0){
            System.out.println("Empty LL");
        }
        else if(size == 1){
            head = tail = null;
            size--;
        }
        else{
            Node temp = head;
            for(int i = 0; i< size - 2 ; i++){  // becozz bahr nikle par temp second last ko hi point karega
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
            size--;
        }
       }
    }
    public static void main(String[] args){
        System.out.println("LnkedList Implementaion");
        LL L_list = new LL();

        L_list.addlast(10);
        L_list.addlast(20);
        L_list.addlast(30);
        L_list.addlast(40);
        L_list.addlast(50);
        L_list.display();

        System.out.println(L_list.size());

        L_list.removefirst();
        L_list.display();

        System.out.println(L_list.getLast());
        System.out.println(L_list.getFirst());        
        System.out.println(L_list.getAt(2));

        L_list.addFirst(5);
        L_list.display();

        L_list.addAt(100, 2);
        L_list.display();

        L_list.removeLast();
        L_list.display();
       


    }
}
    