import java.util.*;
public class bankAccount{ 
  public static void main(String args[]){
       
      // Creating Object 
      Accounts acccount1 = new Accounts();
      
      acccount1.userName = "Nikhil";                        
      acccount1.setPass("12345");
      
      System.out.println(acccount1.userName);
      acccount1.showPass();
  }
}

class Accounts{
      public String userName;
      private String password;

      public void setPass(String pwd){
        password = pwd;
      }
      public void showPass(){
        System.out.println(password);
      }
}
