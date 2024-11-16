package Searching.BinarySearch;

public class RecursiveBinarySearch {
    static boolean recBS(int[] arr, int st, int end, int target){
        // Base case
        if(st > end) return false ;
        int mid = (st+end)/2 ;
        if(target == arr[mid]) return true;
        else if (target < arr[mid]){
            return recBS(arr,st,mid-1,target);
        }
        else{
            return recBS(arr,mid+1,end,target);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 15, 20, 24, 45, 50, 77, 89} ;
        int target = 15;
        System.out.println("Is "+target+" present in array : "+recBS(arr,0,arr.length-1,target));
    }
}
