package Searching.BinarySearch.Problems;

public class LastOccurrence {
    static int lastOccurrence(int[] arr, int target){
        int lastOcc = -1;
        int st = 0, end = arr.length-1;
        while (st <= end) {
            int mid = st + (end-st)/2 ;
            if(arr[mid]==target){
                lastOcc = mid;
                st = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return lastOcc ;
    }
    public static void main(String[] args) {
        int[] arr = {3,3,5,5,5,9,9,11,12,12,14,14,14};
        int x = 3;
        System.out.println("First occurrence of "+x+" : "+lastOccurrence(arr,x));
    }
}
