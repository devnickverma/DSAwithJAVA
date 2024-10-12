public class Quest2{
    static String arr[] = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void printDigits(int number){
           
           if(number == 0) {
              return;
            }
            int lastDigit = number%10;
            printDigits(number/10);
            System.out.print(arr[lastDigit]+" ");

    }

    public static void main(String[] args) {
         printDigits(2005);
    }
}