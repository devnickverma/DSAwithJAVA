import java.util.*;
public class stringBuilder{ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='e'; ch++){
             sb.append(ch);
        }
        System.out.println("String is : " + sb);
    }
}