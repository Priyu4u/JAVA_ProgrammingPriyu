package Array2D;
import java.util.Scanner;
public class PascalTriangle {

    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
    static void pascalTriangleCombination(int n){
        for(int i=0; i<n;i++){
            for(int j=n-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                int ans = factorial(i) / (factorial(j) * factorial(i-j));
                System.out.print(ans+" ");
            }
            System.out.println();
        }
    }

    static void pascalTriangleWithoutCombination(int n){
        int[][] ans = new int[n][];
        for(int i=0; i<n; i++){
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1 ;
            for(int j=1; j<i; j++){
                ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
            }

        }
        printArray(ans);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        // Given an integer n, return the first 'n' rows of pascal triangle

        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        System.out.println("First "+n+" rows of Pascal Triangle using Combination:");
        pascalTriangleCombination(n);
        System.out.println("First "+n+" rows of Pascal Triangle without using Combination:");
        pascalTriangleWithoutCombination(n);

    }
}
