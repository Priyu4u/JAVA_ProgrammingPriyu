package Array.Questions;
import java.util.Arrays;
import java.util.Scanner;
public class SmallestAndLargestReturn {

    // Write a method which takes an array as input and returns an array
    // which has only two elements, the smallest and largest element

    static int[] smallestAndLargest (int[] arr){
        Arrays.sort(arr);
        int ans[] = { arr[0], arr[arr.length-1]};
        return ans ;
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

        int[] ans = smallestAndLargest(arr);
        System.out.println("Smallest and Largest elements are : " + ans[0] + " and " +ans[1]);
    }
}
