import java.util.*;
public class DuplicateParenthese{
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
    
            // Closing
            if(ch == ')'){
                int count = 0;
                while(s.pop() != '('){
                    count++;
                }
                if(count < 1){
                    return true;
                }
            }

            // Opening
            else{
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String args[]){
        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println("Parentheses are valid : " + isDuplicate(str));
        System.out.println("Parentheses are valid : " + isDuplicate(str2));
    }
}