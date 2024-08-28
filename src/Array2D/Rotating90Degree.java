package Array2D;
import java.util.Scanner;
public class Rotating90Degree {
    // Given a square matrix, rotate it by 90 degrees in a clockwise
    // direction without using any extra space

    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transposeInplace(int[][] arr, int r){
        for(int i=0; i<r; i++){
            for(int j=i; j<r; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void reverseEachRow(int[] arr){
        int left = 0, right = arr.length - 1;
        while (left<right){
            // swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    static void rotateArray90Degree(int[][] arr, int r){
        // calculating transpose of array
        transposeInplace(arr,r);

        // reversing each row of array
        for(int i=0; i<r; i++){
            reverseEachRow(arr[i]);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter no. of rows or column of square matrix: ");
        int r = sc.nextInt();

        int[][] arr = new int[r][r];
        System.out.println("Enter "+ (r*r) +" elements of matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<r; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix :");
        printArray(arr);
        System.out.println("Matrix after rotating 90 degrees : ");
        rotateArray90Degree(arr, r);
        printArray(arr);

    }
}
