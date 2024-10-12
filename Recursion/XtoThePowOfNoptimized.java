public class XtoThePowOfNoptimized{
    public static int powOfN(int x, int n){

        if(n==0){
            return 1;
        }

        int halfPower = powOfN(x, n/2);
        int ans = halfPower * halfPower;

        if(n % 2 == 1){
              ans = x * ans;
        }

        return ans;
    }
    public static void main(String[] args){
        System.out.println(powOfN(2, 10));
    }
}