package Array2D;
import java.util.Scanner;
public class SumOfRecPrefixSumRowCol {
    static void prefixSumRow(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0; i<r; i++){
            for(int j=1; j<c; j++){
                arr[i][j] += arr[i][j-1] ;
            }
        }
    }

    static void prefixSumColumn(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        for(int j=0; j<c; j++){
            for(int i=1; i<r; i++){
                arr[i][j] += arr[i-1][j] ;
            }
        }
    }

    static void prefixSumRecOptimised(int[][] arr, int l1, int r1, int l2, int r2){
        int ans = 0;
        if(l1 > 0 && r1 > 0){
            ans = arr[l2][r2] - arr[l1-1][r2] - arr[l2][r1-1] + arr[l1-1][r1-1];
        } else{
            ans = arr[l2][r2] ;
        }

        System.out.println("Sum of rectangle in given boundaries : "+ans);
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
        prefixSumRow(arr);
        prefixSumColumn(arr);

        System.out.print("Enter number of queries : ");
        int q = sc.nextInt();
        for(int i=1; i<=q; i++){
            System.out.print("Enter first co-ordinates(l1,r1) : ");
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            System.out.print("Enter second co-ordinates(l2,r2) : ");
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();
            prefixSumRecOptimised(arr,l1,r1, l2,r2);
        }

    }
}
