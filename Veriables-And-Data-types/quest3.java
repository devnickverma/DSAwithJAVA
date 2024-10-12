import java.util.*;
public class quest3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter teh cost of pen : ");
        float pen = sc.nextFloat();
        System.out.print("Enter teh cost of pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter teh cost of eraser : ");
        float eraser = sc.nextFloat();
        float ans = pen+pencil+eraser+(((pen+pencil+eraser)/100)*18);
        System.out.print("Total cost is : ");
        System.out.print(ans);
    }
}