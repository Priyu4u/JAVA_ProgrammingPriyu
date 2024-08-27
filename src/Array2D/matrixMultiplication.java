package Array2D;
import java.util.Scanner;
public class matrixMultiplication {

    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void matrixMultiply(int[][] arr1, int r1,int c1, int[][] arr2, int r2, int c2){
        if(c1 != r2){
            System.out.println("Multiplication is not possible !");
            return;
        }
        int[][] ans = new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<r2; k++){
                    ans[i][j] += arr1[i][k] * arr2[k][j] ;
                }
            }
        }
        printArray(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter no. of rows of matrix 1 : ");
        int r1 = sc.nextInt();
        System.out.print("Enter no. of columns of matrix 1 : ");
        int c1 = sc.nextInt();

        int[][] arr = new int[r1][c1];
        System.out.println("Enter elements of matrix 1 : ");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter no. of rows of matrix 2 : ");
        int r2 = sc.nextInt();
        System.out.print("Enter no. of columns of matrix 2 : ");
        int c2 = sc.nextInt();

        int[][] brr = new int[r2][c2];
        System.out.println("Enter elements of matrix 2 : ");
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                brr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1 :");
        printArray(arr);
        System.out.println("Matrix 2 :");
        printArray(brr);
        System.out.println("(Matrix 1) * (Matrix 2) : ");
        matrixMultiply(arr, r1,c1, brr, r2, c2);

    }
}
