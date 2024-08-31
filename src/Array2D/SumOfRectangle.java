package Array2D;
import java.util.Scanner;
public class SumOfRectangle {

    static void sumOfRecBruteForce(int[][] arr, int l1, int r1, int l2, int r2){
        int sum = 0;
        for(int i=l1; i<=l2; i++){
            for(int j=r1; j <= r2; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
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
        System.out.print("Enter first co-ordinates(l1,r1) : ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.print("Enter second co-ordinates(l2,r2) : ");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.print("Sum of rectangle using brute force method : ");
        sumOfRecBruteForce(arr,l1,r1,l2,r2);


    }
}
