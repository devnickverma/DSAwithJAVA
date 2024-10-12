public class TypePromotion{
    public static void main(String args[]){
        // Type promotion happens when we use operands like +, -, *, / etc.
        // char , byte , short --> int
        // long , float , double --> biggest present data type
            char a = 'a';
            char b = 'b';
            System.out.println((int)a);
            System.out.println((int)b);
            System.out.println(b-a);

            byte bt = 5;
            bt = (byte) (bt * 2);
            System.out.println(bt);
    }
}