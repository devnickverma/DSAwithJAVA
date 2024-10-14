public class SearchInRotatedSortedArray{

    public static int search(int[] arr, int target, int si, int ei) {
           
           if(si > ei) {
               return -1;
           }

           int mid = si + (ei-si)/2;
 
           if(arr[mid] == target) {
               return mid;
           }

            // Mid lies in Line 1
           if(arr[si] <= arr[mid]) {
                // Target lies in left part of line 1
               if(arr[si] <= target && target <= arr[mid]) {
                   return search(arr, target, si, mid-1);
               }
               // Target lies in right part of line 1
               return search(arr, target, mid+1, ei);
           } 
           
           // Mid lies in Line 2
           else {
               // Target lies in right part of line 2
               if(arr[mid] <= target && target <= arr[ei]) {
                   return search(arr, target, mid+1, ei);
               }
               // Target lies in left part of line 2
               return search(arr, target, si, mid-1);
           }

    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 2;
        System.out.println();
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
}