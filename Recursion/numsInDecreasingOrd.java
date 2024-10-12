public class numsInDecreasingOrd{
    public static void decreasingOrd(int n){
        System.out.print(n + " ");
        if(n==1){
            return;
        }
        decreasingOrd(n-1);
    }
    public static void main(String[] args){
        decreasingOrd(10);
    }
}