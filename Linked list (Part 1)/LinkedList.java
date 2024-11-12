public class LinkedList{

      public static class Node{
           int data;
           Node next;
           
           public Node(int data){
             this.data = data;
             this.next = null;
           }
       }

      public static Node head;
      public static Node tail;
      public static int size;

      public void addFirst(int data){

          // Step 1 :- create new node
          Node newNode = new Node(data);
          
          size++;

          if(head == null){
              head = tail = newNode;
              return;
          }

          // Step 2 :- newNode next = head
          newNode.next = head;

          // Step 3 :- head = newNode
          head = newNode;

      }

      public void addLast(int data){

          // Step 1 :- create new node
          Node newNode = new Node(data);

          size++;

          if(head==null){
            head = tail = newNode;
            return;
          }

          // Step 2 :- tail next = newNode
          tail.next = newNode;

          // Step 3:- tail = newNode
          tail = newNode;

      }

      public void print(){
        if(head == null){
             System.out.print("Linked List is empty");
        }
        Node temp = head;
        while(temp != null){
             System.out.print(temp.data + " -> ");
             temp = temp.next;
        }
        System.out.println("null");
      }

      public void add(int idx, int data){
 
        if(idx == 0){
          addFirst(data);
          return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        
        while(i < idx - 1){
          temp = temp.next;
          i++;
        }

        // i = idx - 1, temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

      }

      public int removeFirst(){

        if(size == 0){
          System.out.println("Linked list is empty");
          return Integer.MIN_VALUE;
        }
        else if (size == 1){
             int val = head.data;
             head = tail = null;
             size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;    
      }

      public int removeLast(){
        if(size == 0){
          System.out.println("Linked list is empty");
          return Integer.MIN_VALUE;
        }
        else if (size == 1){
             int val = head.data;
             head = tail = null;
             size = 0;
            return val;
        }

        // Prev : i = size - 2
        Node prev = head;
        for(int i = 0; i< size - 2; i++){
             prev = prev.next;
        } 
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

      }

      public static void main(String args[]){
          LinkedList ll = new LinkedList();
          System.out.println();
          ll.addFirst(4);
          ll.addFirst(2);
          ll.addFirst(1);
          ll.addLast(5);
          ll.add(2, 3);
          ll.print();
          System.out.println("Size of linked list is : " + size); 
          ll.removeFirst();
          ll.print();
          System.out.println("Size of linked list is : " + size);
          ll.removeLast();
          ll.print();
          System.out.println("Size of linked list is : " + size); 
      }

}