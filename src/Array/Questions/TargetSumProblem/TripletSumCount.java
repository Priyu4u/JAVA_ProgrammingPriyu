package Array.Questions.TargetSumProblem;
import java.util.Scanner;
public class TripletSumCount {

    // Count the number of triplets whose sum equal to the given value of x

    static void tripletSum(int[] arr, int x){
        int count = 0;
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == x) count++ ;
                }
            }
        }
        System.out.println(count+" Triplets");
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
        System.out.print("Enter target number : ");
        int x = sc.nextInt();

        tripletSum(arr , x);

    }
}
