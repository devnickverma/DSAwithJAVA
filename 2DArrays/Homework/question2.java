import java.util.*;
public class question2{ 
    public static int sumOfRow(int matrix[][]){
      int sum = 0;
      for(int i=0; i<matrix[0].length; i++){
            sum += matrix[1][i];
      }   
     return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println(sumOfRow(matrix));
    }
}