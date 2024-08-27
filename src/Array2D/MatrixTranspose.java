package Array2D;
import java.util.Scanner;
public class MatrixTranspose {
    // WAP to display the transpose of matrix entered by the user
    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transposeMatrix(int[][] arr, int r, int c ){
        int[][] trans = new int[c][r];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                trans[i][j] = arr[j][i];
            }
        }
        printArray(trans);
    }

    static void transposeMatrixInplace(int[][] arr, int r, int c){
        // Inplace means return same array
        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){
                // swap arr[i][j] and arr[j][i]
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter no. of rows of matrix: ");
        int r = sc.nextInt();
        System.out.print("Enter no. of columns of matrix: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter elements of matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix :");
        printArray(arr);
        System.out.println("Transpose Matrix using another array: ");
        transposeMatrix(arr, r, c);

        // only for square matrix
//        System.out.println("Transpose Matrix without creating another array");
//        transposeMatrixInplace(arr, r, c);
//        printArray(arr);


    }
}
