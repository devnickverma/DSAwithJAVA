import java.util.*;
public class question3{ 
    public static void change(int matrix[][]){
      for(int i=0; i<matrix[0].length; i++){
        for (int j=0; j<matrix.length; j++){
          System.out.print(matrix[j][i] + " ");
        }
        System.out.println();  
      }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = { {1,2,3}, {4,5,6}};
        change(matrix);
    }
}