public class MergeSort{

    public static void mergeSort(int arr[], int si, int ei){
         if(si >= ei){
            return;
         }
         // kaam
         int mid = si + (ei-si)/2;
         mergeSort(arr, si, mid); // Left part
         mergeSort(arr, mid+1, ei); // Right Part
         merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){

        int temp[] = new int[ei-si+1]; 
        int i = si;
        int j = mid+1;
        int k = 0; 

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }
            else{
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        // Left part
        while(i <= mid){
            temp[k] = arr[i];
            k++;
            i++;
        }

        // Right part
        while(j <= ei){
            temp[k] = arr[j];
            k++;
            j++;
        }
        
        // copy temp to arr
        for(i=0;i<temp.length;i++){ 
            arr[si+i] = temp[i];
        }

    }

   public static void printArr(int arr[]){
     System.out.println();
      for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
      }
      System.out.println();
   }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}