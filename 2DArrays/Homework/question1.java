import java.util.*;
public class question1{ 
    public static int count(int matrix[][], int key){
      int cnt = 0;
      for(int i=0; i<matrix.length; i++){
        for (int j=0; j<matrix[0].length; j++){
          if(matrix[i][j]==key){
            cnt++;
          }
        }   
      }
     return cnt;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = { {4,7,8},{8,8,7} };
        System.out.println(count(matrix, 8));
    }
}