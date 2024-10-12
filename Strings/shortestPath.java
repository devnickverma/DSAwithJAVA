import java.util.*;
public class shortestPath{ 
    public static double  ShortestPath(String str){
       int  x = 0, y = 0;
       char dir;
       for(int i=0; i<str.length(); i++){
        dir = str.charAt(i);
          if(dir == 'N'){
            y++;
          }
          else if (dir == 'S'){
            y--;
          }
          else if (dir == 'W'){
            x--;
          }
          else {
            x++;
          }
       }
       return Math.sqrt((x*x)+(y*y));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print("Minimum Distance : " + ShortestPath(str));
    }
}