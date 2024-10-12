public class removeDuplicates{

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        
        // Base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
 

        // Processing
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == false){
            newStr.append(currChar);
            map[currChar - 'a'] = true;
        }

        // Recursive call
        removeDuplicates(str, idx+1, newStr, map);
    }

    public static void main(String[] args){
        removeDuplicates("aaabebbccdddddddeeeeeeec", 0, new StringBuilder(), new boolean[26]);
    }
}