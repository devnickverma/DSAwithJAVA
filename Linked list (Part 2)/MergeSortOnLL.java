

import java.util.LinkedList;
public class MergeSortOnLL{
    public static void main(String args[]){
        // Create
        LinkedList<Integer> ll = new LinkedList<>();

        // Add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll);

        // Remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}