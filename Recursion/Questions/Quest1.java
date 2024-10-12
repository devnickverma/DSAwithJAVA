public class Quest1{

    public static void check(int i, int arr[], int key){
           
           // Base case
           if(i == arr.length){
            return;
           }
           if(arr[i]==key){
            System.out.print(i + " ");
           }

           check(i+1, arr, key);
    }

    public static void main(String[] args) {
         int arr[] =  {3, 2, 4, 5, 6, 2, 7, 2, 2}; 
         check(0, arr, 2);
    }
}