package Array.Questions.TwoPointerProblems;
import java.util.Arrays;
import java.util.Scanner;
public class squareInSorted {
    // Given an integer array sorted in non-decreasing order , return
    // an array of the squares of each number sorted in non-decreasing
    // order
    static int[] sortSquaresArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int left = 0, right = n-1;
        int k = n-1;
        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k] = arr[left] * arr[left] ;
                left++;
                k--;
            }
            else{
                ans[k] = arr[right] * arr[right] ;
                right--;
                k--;
            }
        }
        return ans;
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

        System.out.print("Enter number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements in non-decreasing order: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array : ");
        printArray(arr);
        int[] ans = sortSquaresArray(arr);

        System.out.print("Sorted Array : ");
        printArray(ans);

    }
}
