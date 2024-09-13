package Recursion.RecursionOnArray;

public class TargetElement {

    // check if an element present in array and return index if present else return -1
    static int checkTargetIdx(int[] arr, int n,int idx, int target){
        if(idx == n) return -1;
        if(arr[idx] == target) return idx;
        return checkTargetIdx(arr, n,idx+1,target);
        // Time complexity : O[n]
    }

    // check if an element present in array and return true or false
    static boolean checkTarget(int[] arr, int n,int idx, int target){
        if(idx == n) return false;
        if(arr[idx] == target) return true;
        return checkTarget(arr, n,idx+1,target);
        // Time complexity : O[n]
    }
    public static void main(String[] args) {
        int[] arr = {5,7,11,72,54,6};
        int target = 9;

        // returning true or false
        if(checkTarget(arr, arr.length,0, target)){
            System.out.println("Is "+target+" present in array : Yes");
        }
        else {
            System.out.println("Is "+target+" present in array : No");
        }

        // returning index of target element
        System.out.println("Index of "+target+" : "+checkTargetIdx(arr,arr.length,0,target));

    }
}
