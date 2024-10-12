public class XtoThePowOfN{
    public static int powOfN(int x, int n){
        if(n==0){
            return 1;
        }
        
        return x*powOfN(x, n-1);
    }
    public static void main(String[] args){
        System.out.println(powOfN(2, 10));
    }
}