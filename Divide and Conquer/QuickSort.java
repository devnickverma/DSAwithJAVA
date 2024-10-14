public class QuickSort{

    public static void quickSort(int arr[], int si, int ei) {
           
           if(si >= ei){
            return;
           }
           // Last element
           int pivotIdx = partition(arr, si, ei);
           partition(arr, si, pivotIdx - 1); // Left part
           partition(arr, pivotIdx + 1, ei); // Right part
    }
    
    public static int partition(int arr[], int si, int ei) {
           
           int pivot = arr[ei];
           int i = si - 1; // To make place for element less than pivot

           for(int j = si; j < ei; j++) {
               if(arr[j] <= pivot) {
                   i++;
                   // Swap
                   int temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
               }
           }
           
           i++; // To make place for pivot

           // Placing pivot at right place
           int temp = pivot;
           arr[ei] = arr[i];
           arr[i] = temp;
           return i;

    }

    public static void printArr(int arr[]) {
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}