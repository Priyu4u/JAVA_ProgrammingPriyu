package Array.Questions.PrefixSumApproach;
import java.util.Scanner;

public class equalSumSubarray2 {
    // Check if we can partition the array into two sub-arrays with
    // equal sum . More formally , check that the prefix sum of a part
    // the array is equal to the suffix sum of the rest of array

    static int findArraySum(int[] arr){
        int totalSum = 0;
        for(int i=0; i<arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);
        int prefSum = 0;
        for(int i=0; i<arr.length; i++){
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if(prefSum == suffixSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter number of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal partition possible : "+equalSumPartition(arr));


    }
}
