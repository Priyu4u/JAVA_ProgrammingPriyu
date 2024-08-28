package Array2D;
import java.util.Scanner;
public class PascalTriangle {
    static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
    static void pascalTriangle(int n){
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        // Given an integer n, return the first 'n' rows of pascal triangle

        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        System.out.println("First "+n+" rows of Pascal Triangle :");
        pascalTriangle(n);

    }
}
