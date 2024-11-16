package Searching.BinarySearch.Problems;

// find the first occurrence of given element x, given that the given
// array is sorted. if no occurrence of x is found then return -1
public class FirstOccurrence {
    static int firstOccurrence(int[] arr, int target){
        int firstOcc = -1;
        int st = 0, end = arr.length-1;
        while (st <= end) {
            int mid = st + (end-st)/2 ;
            if(arr[mid]==target){
                firstOcc = mid;
                end = mid - 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return firstOcc ;
    }
    public static void main(String[] args) {
        int[] arr = {3,3,5,5,5,9,9,11,12,12,14,14,14};
        int x = 14;
        System.out.println("First occurrence of "+x+" : "+firstOccurrence(arr,x));
    }
}
