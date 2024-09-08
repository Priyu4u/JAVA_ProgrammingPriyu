package Recursion;
import java.util.Scanner;
public class FibonacciSeries {
    static int fibonacci(int n){
        if(n == 1 || n == 0) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Invalid Input !");
            return;
        }

//         To print n-th fibonacci number
        System.out.println(n+"-th Fibonacci Number : "+fibonacci(n));

//         To print first n fibonacci numbers
        for(int i=0; i<=n; i++){
            System.out.print(fibonacci(i)+" ");
        }

        // Time complexity : O[2^n]
        // Space Complexity : O[n]
    }
}
