package Array.Questions;
import java.util.Scanner;
public class TotalElementGreaterThanX {

    // Count the number of elements strictly greater than value x

    static void comparisonGreaterThan(int[] arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > x){
                count++;
            }
        }
        System.out.println("Total elements greater than "+x+" = "+count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {12, 45, 85, 12, 45, 41, 65, 85, 45, 11, 63, 11 } ;
        System.out.print("Enter element you want to search : ");
        int x = sc.nextInt();
        comparisonGreaterThan(arr,x);

    }
}
