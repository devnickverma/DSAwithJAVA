import java.util.*;
public class setterAndGetter{ 
  public static void main(String args[]){
       
      // Creating Object 
      Pen p1 = new Pen();
      
      p1.setColor("Yellow");
      System.out.println("Color : " + p1.getColor());

      p1.setTip(2);
      System.out.println("Tip : " + p1.getTip());
  }
}

class Pen{
    private String color;
    private int tip;
      
      String getColor(){
          return this.color;
      }

      int getTip(){
          return this.tip;
      }
      
      void setColor(String newColor){
          this.color = newColor;
      }
      
      void setTip(int newTip){
        this.tip = newTip;
      }
}
