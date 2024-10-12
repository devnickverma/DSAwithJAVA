public class FriendsPairing{

    public static int friendsPairing(int n){
       
       // Base Case
       if(n==1 || n==2){
           return n;
       }

       return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    
    //    // Choice
    //    // Single
    //    int fnm1 = friendsPairing(n-1);

    //    // Pair
    //    int fnm2 = friendsPairing(n-2);
    //    int pairWays = (n-1) * fnm2;

    //    // Total Ways
    //    int totalWays = pairWays + fnm1;
    //    return totalWays;
    
    }

    public static void main(String args[]){
        System.out.println(friendsPairing(4));
    }
}