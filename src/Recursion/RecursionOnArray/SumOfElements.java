package Recursion.RecursionOnArray;

public class SumOfElements {
    static int sum(int[] arr, int idx){
        if(idx == arr.length) return 0;
        return arr[idx] + sum(arr, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {19,4,5,3,7,13,9};
        System.out.println("Sum of elements of array : "+sum(arr,0));
    }
}
