package Array.Questions.PrefixSumApproach;
import java.util.Scanner;
public class rangeQuerySum {
    // Given an array of integers of size n, Answer q queries where
    // you need to print the sum of values in a given range of indices
    // from l to r(both included)
    // NOTE: The values of l and r in queries follow 1-based indexing

    static void printSum(int[] arr, int l, int r){
        int sum = arr[r] - arr[l-1];
        System.out.println("Sum from "+l+" to "+r+" = "+sum);
    }
    static void prefixSum(int[] arr){
        int n = arr.length;
        for(int i=2; i<n; i++){
            arr[i] += arr[i-1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter number of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.print("Enter array elements : ");
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }
        prefixSum(arr);
        System.out.print("Enter number of queries : ");
        int q = sc.nextInt();
        while (q > 0){
            System.out.print("Enter range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            printSum(arr,l,r);
            q-- ;
        }


    }
}
