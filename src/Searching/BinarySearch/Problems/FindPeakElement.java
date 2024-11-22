package Searching.BinarySearch.Problems;

//A peak element is an element that is strictly greater than its neighbors.
//Given a 0-indexed integer array nums,find a peak element, and return its index.
//If the array contains multiple peaks,
//return the index to any of the peaks.
//You may imagine that nums[-1] = nums[n] = -∞. In other words,
//an element is always considered to be strictly greater than a neighbor that is outside the array.
//You must write an algorithm that runs in O(log n) time.
public class FindPeakElement {
    static int findPeakElement(int[] a) {
        int n = a.length;
        int st = 0, end = n-1;
        while (st<=end){
            int mid = st+(end-st)/2;
            if((a[mid]==0||a[mid]>a[mid-1]) && (a[mid]==n-1||a[mid]>a[mid+1])){
                return mid;
            }
            else if(a[mid]<a[mid+1]){
                st = mid + 1;
            }
            else{

                end = mid - 1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(arr));;
    }
}
