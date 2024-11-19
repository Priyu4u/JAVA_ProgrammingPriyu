package Searching.BinarySearch.Problems;

// Given a rotated sorted array, find the index of the minimum element
// in the array (0 based indexing, all elements are unique)

public class MinEleIndex {
    static int minimumEleIdx(int[] arr){
        int ans = -1, n = arr.length;
        int st = 0, end = n-1;
        while (st<=end){
            int mid = st + (end-st)/2 ;
            if(arr[mid] <= arr[n-1]){
                ans = mid;
                end = mid-1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println("Index of minimum element : "+minimumEleIdx(arr));
    }
}
