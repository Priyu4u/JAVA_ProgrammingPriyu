package Array.Questions.PrefixSumApproach;
import java.util.Scanner;
public class returnPrefixSum {
    // Given an integer array, return the prefix sum/running sum in the
    // same array without creating a new array

    static void prefixSumSameArray(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            arr[i] += arr[i-1];
        }
    }

    static int[] prefixSumNewArray(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for(int i=1; i<n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter number of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array : ");
        printArray(arr);

        int[] ans = prefixSumNewArray(arr);
        System.out.print("Prefix Sum by New Array : ");
        printArray(ans);

        prefixSumSameArray(arr);
        System.out.print("Prefix Sum by Same Array : ");
        printArray(arr);

    }
}
