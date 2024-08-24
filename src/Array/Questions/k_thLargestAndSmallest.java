package Array.Questions;
import java.util.Arrays;
import java.util.Scanner;
public class k_thLargestAndSmallest {

    // Write a method which takes an array and k as input and returns an array
    // which has only two elements, the k-th smallest and largest element

    static int[] kthLargestAndSmallest(int[] arr, int k){
        Arrays.sort(arr);
        int[] ans = {arr[k-1] , arr[arr.length - k]} ;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        System.out.print("Enter elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k : ");
        int k = sc.nextInt();

        int[] ans = kthLargestAndSmallest(arr, k) ;
        System.out.println(k+"-th Smallest Element : "+ans[0]);
        System.out.println(k+"-th Largest Element : "+ans[1]);


    }

}
