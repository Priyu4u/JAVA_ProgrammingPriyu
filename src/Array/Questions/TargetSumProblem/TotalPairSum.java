package Array.Questions.TargetSumProblem;
import java.util.Scanner;

public class TotalPairSum {

    // Find the total number of pairs in the array whose
    // sum is equal to the given value x

    static void checkSum(int[] arr, int x){
        int count = 0;
        for(int i=0; i< arr.length - 1; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] + arr[j] == x) count++ ;
            }
        }
        System.out.println(count+" Pairs");
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
        System.out.print("Enter value of x : ");
        int x = sc.nextInt();

        checkSum(arr,x);

    }
}
