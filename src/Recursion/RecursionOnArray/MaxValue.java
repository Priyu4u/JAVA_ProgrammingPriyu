package Recursion.RecursionOnArray;

public class MaxValue {
    static int maxVal(int[] arr, int idx){
        if(idx == arr.length-1) return arr[idx];
        int max = maxVal(arr,idx+1);
        return Math.max(arr[idx],max);
    }
    public static void main(String[] args) {
        int[] arr = {19,4,5,3,7,13,9};
        System.out.println("Max element : "+maxVal(arr,0));
    }
}
