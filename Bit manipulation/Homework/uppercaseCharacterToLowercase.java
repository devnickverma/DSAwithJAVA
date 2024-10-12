import java.util.*;
public class uppercaseCharacterToLowercase {
    public static void main(String[] args) {
        
        // Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
        System.out.print((char)(ch | ' ') + " ");
        // prints abcdefghijklmnopqrstuvwxyz
        }
    
    }
}
