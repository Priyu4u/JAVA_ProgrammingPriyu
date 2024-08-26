package Array.Questions.PrefixSumApproach;
import java.util.Scanner;
public class equalSumSubarray {
    // Check if we can partition the array into two sub-arrays with
    // equal sum . More formally , check that the prefix sum of a part
    // the array is equal to the suffix sum of the rest of array
    static int[] prefixSum(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for(int i=1; i<n; i++){
            pref[i] = arr[i] + arr[i-1];
        }
        return pref;
    }

    static int[] suffixSum(int[] arr){
        int n = arr.length;
        int[] suff = new int[n];
        suff[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            suff[i] = arr[i] + arr[i+1];
        }
        return suff;
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
        int[] prefix = prefixSum(arr);
        int[] suffix = suffixSum(arr);
        boolean flag = false;
        for(int i=0; i<n-1; i++){
            if(prefix[i] == suffix[i+1]){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("True");
        else System.out.println("False");


    }
}
