public class LastOccurence{
    public static int lastOcc(int[] arr, int i, int key){
        if(arr[i]==key){
            return i;
        }
        if(i==0){
            return -1;
        }
        return lastOcc(arr, i-1, key);
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,5,5,5,5,9,6,7};
        System.out.println(lastOcc(arr, arr.length-1, 5));
    }
}