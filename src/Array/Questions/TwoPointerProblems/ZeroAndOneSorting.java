package Array.Questions.TwoPointerProblems;
import java.util.Scanner;
public class ZeroAndOneSorting {
    // Sort an array containing only 0's and 1's

    static int[] sortWithout2Pointer(int[] arr){
        int countZero = 0, n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == 0)
                countZero++ ;
        }

        for(int i=0; i<n; i++){
            if(i<countZero){
                arr[i] = 0;
            } else{
                arr[i] = 1;
            }
        }
        return arr;
    }

    static int[] sortWith2Pointer(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        while (left < right){
            if(arr[left] == 1 && arr[right]==0){
                int temp = arr[left];
                arr[left] = arr[right] ;
                arr[right] = temp;
                left++ ;
                right-- ;
            }
            if(arr[left] == 0) left++ ;
            if(arr[right] == 1) right-- ;
        }
        return arr;
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

        // arr = sortWithout2Pointer(arr);
        arr = sortWith2Pointer(arr) ;

        System.out.println("After sorting : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
