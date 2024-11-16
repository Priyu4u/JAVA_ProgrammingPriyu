package Searching.BinarySearch;

public class BasicBinarySearch {
    static boolean binarySearch(int[] arr, int target){
        int st = 0 , end = arr.length-1, mid;
        while (st <= end){
            mid = (st + end) / 2 ;
            if(arr[mid] == target){
                return true ;
            }
            else if (arr[mid] < target){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        // binary search is applicable only on sorted array
        int[] arr = {2, 4, 5, 7, 15, 20, 24, 45, 50, 77, 89} ;
        System.out.println(binarySearch(arr,45));
    }
}
