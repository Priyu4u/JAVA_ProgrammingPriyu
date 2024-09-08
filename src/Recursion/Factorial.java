package Recursion;
import java.util.Scanner;
public class Factorial {

    static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n-1);      // recurrence relation
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Invalid Input !");
            return;
        }
        System.out.print(n+"! = "+factorial(n));

        // Time Complexity -> O[n]
        // Space Complexity -> O[n]
    }
}
