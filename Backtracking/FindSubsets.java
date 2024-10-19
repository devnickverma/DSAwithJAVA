public class FindSubsets{
  
    public static void findSubsets(String str, String ans, int idx){
          //Base case
          if(idx == str.length()){
              if(ans.length() == 0){
                  System.out.println("null");
              }else{
                  System.out.println(ans);
              }
              return;
          }
          // Yes Choice 
          findSubsets(str, ans+str.charAt(idx), idx+1);

          // No Choice
          findSubsets(str, ans, idx+1);
    } 

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }

}