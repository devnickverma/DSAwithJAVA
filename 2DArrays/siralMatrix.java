import java.util.*;
public class siralMatrix{ 
    public static void Spiralmatrix(int matrix[][]){
      int sRow = 0;
      int sCol = 0;
      int eRow = matrix.length-1;
      int eCol = matrix[0].length-1;
      
      while(sRow<=eRow && sCol<=eCol){

         // Top
         for(int j=sCol; j<=eCol; j++){
            System.out.print(matrix[sRow][j] + " ");
         }

         // Right
         for(int i=sRow+1; i<=eRow; i++){
            System.out.print(matrix[i][eCol] + " ");
         } 

         // Bottom
         for(int j=eCol-1; j>=sCol; j--){
            if(sRow==eRow){
                break;
            }
            System.out.print(matrix[eRow][j] + " ");
         } 

         // Left
          for(int i=eRow-1; i>=sRow+1; i--){
            if(sCol==eCol){
                break;
            }
            System.out.print(matrix[i][sCol] + " ");
         } 
         
         sRow++;
         sCol++;
         eRow--;
         eCol--;
      }
       System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = {{1,2,3,4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int row = matrix.length, col = matrix[0].length;
        Spiralmatrix(matrix);
    }
}