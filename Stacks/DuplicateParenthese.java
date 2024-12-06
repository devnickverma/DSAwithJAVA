import java.util.*;
public class DuplicateParenthese{
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            // Push opening brackets
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            // Pop closing brackets
            else if(ch == ')' && !s.isEmpty() && s.peek() == '('){
                s.pop();
            }else if(ch == '}' && !s.isEmpty() && s.peek() == '{'){
                s.pop();
            }else if(ch == ']' && !s.isEmpty() && s.peek() == '['){
                s.pop();
            }else{
                return false;
            }
        }
        return s.isEmpty();
    }
    public static void main(String args[]){
        String str = "()[]";
        System.out.println("Parentheses are valid : " + isValid(str));
    }
}