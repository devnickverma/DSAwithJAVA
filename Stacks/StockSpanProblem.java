import java.util.*;
public class StockSpanProblem{
    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1; // span of first element is 1
        s.push(0); // push first index in stack
        for(int i = 1; i < stocks.length; i++){
            while(!s.isEmpty() && stocks[s.peek()] <= stocks[i]){ // while stack is not empty and top of stack is less than current
                s.pop(); // pop the top of stack as it is less than current element
            }
            if(s.isEmpty()){ // if stack is empty 
                span[i] = i + 1; // span of current element is i + 1 as there is no element less than current
            }else{ // if stack is not empty
                span[i] = i - s.peek(); // span of current element is i - top of stack as there is an element less than current
            }
            s.push(i); // push current index in stack as there is an element less than current
        }
        
    }
    public static void main(String args[]){
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);
        for(int i = 0; i < span.length; i++){
            System.out.print(span[i] + " ");
        }
    }
}