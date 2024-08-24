package Array.Questions.TwoPointerProblems;
import java.util.Scanner;
public class EvenOddIntegers {
    // Given an array of integer 'a' , move all the even integers at the beginning
    // of the array followed by all the odd integers . The relative order
    // of odd or even integers does not matter . Return any array that
    // satisfies the condition

    static int[] sortLeftRightInt(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        while (left < right){
            if(arr[left] % 2 != 0 && arr[right] % 2 == 0){
                int temp = arr[left];
                arr[left] = arr[right] ;
                arr[right] = temp;
                left++ ;
                right-- ;
            }
            if(arr[left] % 2 == 0) left++ ;
            if(arr[right] % 2 != 0) right-- ;
        }
        return arr;
    }
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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

        System.out.println("Original Array : ");
        printArray(arr);

        System.out.println("Sorted Array : ");
        sortLeftRightInt(arr);
        printArray(arr);


    }
}
