package Searching.BinarySearch.Problems;

//You are given an integer mountain array arr of length n
// where the values increase to a peak element and then decrease.
//Return the index of the peak element.
//Your task is to solve it in O(log(n)) time complexity.
public class PeakIndexMountainArray {
    static int peakIndexInMountainArray(int[] arr) {
        int st = 0, end = arr.length-1;
        int ans = -1;
        while (st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid] < arr[mid+1]){
                ans = mid+1;
                st = mid+1;
            }
            else{
                end = mid-1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
