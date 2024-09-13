package Recursion.RecursionOnArray;

public class SortedArrayCheck {
    static boolean isSorted(int[] arr, int n, int idx){
        // Base Case
        if(idx == n-1) return true;
        if(arr[idx+1] < arr[idx]) return false;
        return isSorted(arr,n,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 28, 19, 34};
        if(isSorted(arr,arr.length,0)){
            System.out.println("Array is sorted");
        } else{
            System.out.println("Array is not sorted");
        }
    }
}
