package Recursion.RecursionOnArray;

public class LastIndex {
    static int lastIndex(int[] arr, int idx, int x){
        if(idx<0) return -1;

        if(arr[idx]== x){
            return  idx;
        }
        return lastIndex(arr,idx-1,x);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,5,2,5};
        int x = 5;
        System.out.println("Last index of "+x+" : "+lastIndex(arr,arr.length-1,x));
    }
}
