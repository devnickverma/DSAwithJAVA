public class GridWaysInLinear{
    public static int factorial(int n){
           int ans = 1;
           for(int i=1; i<=n; i++){
               ans *= i;
           }
           return ans;
    }
    public static int gridWays(int n, int m){
        int Fact_N = factorial(n-1); // Factorial of n-1
        int Fact_M = factorial(m-1); // Factorial of m-1
        int Fact_SUM = factorial((n-1)+(m-1)); // Factorial of ( (n-1) + (m-1) )
        return Fact_SUM/(Fact_N*Fact_M);
    }
    public static void main(String args[]){
        int n = 3, m = 3;
        System.out.println( "Total ways : " + gridWays(n, m));
    }
}