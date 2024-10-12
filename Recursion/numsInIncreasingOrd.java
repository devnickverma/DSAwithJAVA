public class numsInIncreasingOrd{
    public static void printIncreasingOrd(int n){
           if(n==1){
               System.out.print(n + " ");
               return;
           }
           printIncreasingOrd(n-1);
           System.out.print(n + " ");
    }

    public static void main(String[] args){
        printIncreasingOrd(15); 
    }
}