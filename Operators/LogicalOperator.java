import java.util.*;
public class LogicalOperator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println((3>2) && (5<2)); // And Operator
        System.out.println((3>2) || (5<2)); // Or Operator
        System.out.println(!(3>2)); // Not Operator
    }
}