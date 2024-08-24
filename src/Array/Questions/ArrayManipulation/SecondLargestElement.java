package Array.Questions.ArrayManipulation;
import java.util.Scanner;
public class SecondLargestElement {
    // Find the second-largest element in the given array

    static int secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){max = arr[i] ;
            }
        }
        for(int j=0; j<arr.length; j++){
            if(secMax < arr[j] && arr[j] != max){
                secMax = arr[j] ;
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        System.out.print("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Second Largest Element : "+secondLargest(arr));

    }

}
