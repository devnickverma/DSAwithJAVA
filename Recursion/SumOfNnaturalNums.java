public class SumOfNnaturalNums{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args){  
       System.out.print(sum(100));
    }
}