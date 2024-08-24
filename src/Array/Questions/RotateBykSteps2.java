package Array.Questions;
import java.util.Scanner;
public class RotateBykSteps2 {
    // Rotate the given array by k steps , where k is non-negative
    // without using extra space

    static void reverseArray(int[] arr, int i, int j){
        while (i<j){
            // swap arr[i] and arr[j]
            arr[i] = arr[i] + arr[j] ;
            arr[j] = arr[i] - arr[j] ;
            arr[i] = arr[i] - arr[j] ;
            i++;
            j--;
        }
    }
    static void rotateWithoutExtraSpace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);

        System.out.print("After rotating : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
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

        rotateWithoutExtraSpace(arr,k);

    }
}
