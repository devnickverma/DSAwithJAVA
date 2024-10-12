import java.util.*;
public class basicOfOOPS{ 
  public static void main(String args[]){

    Pen pen1 = new Pen();
    pen1.setColor("blue");
    System.out.println(pen1.color);
    
    pen1.setTip(5);
    System.out.println(pen1.tip);

    pen1.color = "Yellow";
    System.out.println(pen1.color);
  
  }
}

class Pen{
      // Properties 
      String color;
      int tip;

      // functions
      void setColor(String newColor){
         color = newColor;
      }

      void setTip(int newTip){
          tip = newTip;
      }
}
