package Array2D;
import java.util.Scanner;
public class SumofRecPrefixSum {

    static void prefixSumMatrix(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr[i].length; j++){
                arr[i][j] += arr[i][j-1] ;
            }
        }
    }

    static void sumOfRec(int[][] arr, int l1, int r1, int l2, int r2){
        int sum = 0;
        for(int i=l1; i<=l2; i++){
            if(r1 > 0){
                sum += arr[i][r2] - arr[i][r1-1];
            } else{
                sum += arr[i][r2] ;
            }

        }
        System.out.println("Sum of rectangle in given boundaries : "+sum);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();
        System.out.println("Enter elements of matrix :");
        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        prefixSumMatrix(arr);
        System.out.print("Enter number of queries : ");
        int q = sc.nextInt();
        for(int i=1; i<=q; i++){
            System.out.print("Enter first co-ordinates(l1,r1) : ");
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            System.out.print("Enter second co-ordinates(l2,r2) : ");
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();
            sumOfRec(arr,l1,r1,l2,r2);
        }


    }
}
