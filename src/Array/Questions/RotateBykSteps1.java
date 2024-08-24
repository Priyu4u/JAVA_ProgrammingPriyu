package Array.Questions;
import java.util.Scanner;
public class RotateBykSteps1 {
    // Rotate the given array by k steps , where k is non-negative
    // using extra space

    static int[] rotateArray(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n] ;
        int j = 0;
        for(int i=n-k ; i<n; i++){
            ans[j++] = arr[i];
        }
        for(int i=0; i<n-k; i++){
            ans[j++] = arr[i] ;
        }
        return ans ;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter number of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        System.out.print("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k(non-negative) : ");
        int k = sc.nextInt();

        int[] ans = rotateArray(arr,k);

        System.out.print("Array after rotation : ");
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }

    }
}
