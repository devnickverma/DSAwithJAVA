import java.util.ArrayList;
public class ArrayListSyntax{
        public static void main(String[] args) {
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Boolean> list2 = new ArrayList<>();
            ArrayList<String> list3 = new ArrayList<>();

            list1.add(1); // Adding elements
            list1.add(2);
            list1.add(3);
            list1.add(4);

            System.out.println(list1);

            System.out.println("Element at index 0 : " + list1.get(0)); // Accessing elements
            
            list1.remove(0); // Removing elements

            System.out.println(list1);

            // Setting element at index 0 to 10
            list1.set(0, 10);

            System.out.println(list1);
            
            // Contains
            System.out.println(list1.contains(10));
            System.out.println(list1.contains(5));

            // add(index, element)
            list1.add(1, 20);
            System.out.println(list1);
            
        }
}