import java.util.*;
public class ReverseStringUsingStack{
    public static String reverseString(String str){
             Stack<Character> s = new Stack<>();
             int idx = 0;
             while(idx < str.length()){
                s.push(str.charAt(idx));
                idx++;
             }
             
             StringBuilder sb = new StringBuilder("");
             while(!s.isEmpty()){
               sb.append(s.pop());
             }
             
             return sb.toString();
    }
    public static void main(String args[]){
        String str = "Hello World";
        String revstr = reverseString(str);
        System.out.println(revstr);  
    }
}