package Recursion.RecursionOnStrings;

public class SubsetSumInt {
    static void subsetSum(int[] arr, int n, int idx, int currSubSum){
        if(idx >= n){
            System.out.print(currSubSum+" ");
            return;
        }

        // curr idx + currSubSum
        subsetSum(arr,n,idx+1,currSubSum+arr[idx]); // include

        // currSubSum
        subsetSum(arr,n,idx+1, currSubSum);                     // exclude

    }
    public static void main(String[] args) {
        int[] arr = {2,4,5};
        subsetSum(arr,arr.length,0,0);
    }
}
