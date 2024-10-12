import java.util.*;
public class basicRepresentation{ 
    public static void search(int mtx[][], int key){
      for(int i=0; i<mtx.length; i++){
          for(int j=0; j<mtx[0].length; j++){
            if(mtx[i][j]==key){
                System.out.print("Element is found at cell : (" + i + ", " + j + ")");
                return;
            }
          }
        }
        System.out.print("Element is not found");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int mtrx[][] = new int [3][3];
        int row = mtrx.length, col = mtrx[0].length;
        for(int i=0; i<row; i++){
          for(int j=0; j<col; j++){
            mtrx[i][j] = sc.nextInt();
          }
        }
        System.out.println("Matrix : ");
        for(int i=0; i<row; i++){
          for(int j=0; j<col; j++){
            System.out.print(mtrx[i][j] + " ");
          }
          System.out.println();
        }
        search(mtrx, 3);
    }
}