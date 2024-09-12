package Recursion.RecursionOnArray;

public class PrintValues {
    static void printArray(int[] arr, int idx){
        if(idx == arr.length) return;
        System.out.print(arr[idx]+" ");
        printArray(arr,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,7,9};
        printArray(arr,0);
    }
}
