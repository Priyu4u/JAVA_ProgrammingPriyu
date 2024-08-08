package Array;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking array input from user in 1D array
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // printing
        System.out.println("Your entered : ");
        for(int j=0; j<n; j++){
            System.out.print(arr[j]+" ");
        }

    }
}
