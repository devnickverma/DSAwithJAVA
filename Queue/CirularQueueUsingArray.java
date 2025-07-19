import java.util.*;
public class CirularQueueUsingArray{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        } 

        // is full
        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        // Add an element to the queue
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            // Add first element
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        } 

        // Remove an element from the queue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }            

            int result = arr[front];

            // Last element will be removed
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else {
                front = (front + 1) % size;
            }

            return result;
        } 

        // Get the front element of the queue
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}