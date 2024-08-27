package Array2D;
import java.util.Scanner;
public class matrixAddition {
    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        // WAP to add two matrices
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

        int[][] ans = new int[r2][c1];
        if(r1 != r2 || c1 != c2){
            System.out.println("Since Dimensions are not same,\nAddition is not possible !");
            return;
        }

        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                ans[i][j] = arr[i][j] + brr[i][j];
            }
        }
        System.out.println("Matrix 1 : ");
        printArray(arr);
        System.out.println("Matrix 2 : ");
        printArray(brr);
        System.out.println("Matrix 1 + Matrix 2 : ");
        printArray(ans);

    }
}
