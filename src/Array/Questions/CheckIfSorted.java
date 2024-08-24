package Array.Questions;
import java.util.Scanner;
public class CheckIfSorted {

    // Check if given array is sorted or not

    static void checkSorted(int[] arr){
        boolean flag = true;
        for(int i=0; i<arr.length - 1; i++){
            if(arr[i] <= arr[i+1]) {
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        if(flag == true) System.out.println("Array is sorted in ascending order");
        else System.out.println("Array is unsorted");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        System.out.print("Enter elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        checkSorted(arr);

    }
}
