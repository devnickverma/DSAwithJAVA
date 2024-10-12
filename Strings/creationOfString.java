import java.util.*;
public class creationOfString{ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char arr[] = {'a', 'b', 'c', 'd'};

        // Creation of strings
        String str = "abcd";
        String str2 = new String("xyz");

        // NOTE : Strings are immutable

        // input in string
        String nick;
        nick = sc.nextLine();
        System.out.println(nick);

        System.out.println("Length of str : " + str.length());
    }
}