import java.util.*;
public class SortingInArrayList{
   public static void main (String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(334);
    list.add(54);
    list.add(315);
    list.add(25);

    System.out.println(list);

    Collections.sort(list);
    System.out.println(list);

    Collections.sort(list, Collections.reverseOrder()); // In decending order 
    System.out.println(list);

   } 
}