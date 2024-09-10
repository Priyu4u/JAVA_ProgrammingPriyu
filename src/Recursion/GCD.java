package Recursion;
import java.util.Scanner;
public class GCD {

    static int gcdRecursion(int x, int y){
        if(x%y == 0) return y;
        return gcdRecursion(y,x%y);             // Euclid's Algorithm
    }

    static int gcdLongDivMethod(int x, int y){
        while (x%y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    static int gcdBruteForce(int x, int y){     // time complexity : O[min(x,y)]
        int ans = 0, small = y;
        if(x<y) small = x;
        for(int i=small; i>=1; i--){
            if(x%i==0 && y%i==0){
                ans = i;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter first number : ");
        int x = sc.nextInt();
        System.out.print("Enter second number : ");
        int y = sc.nextInt();
        System.out.println("GCD using brute force method : "+gcdBruteForce(x,y));
        System.out.println("GCD using long division method : "+gcdLongDivMethod(x,y));
        System.out.println("GCD using recursion : "+gcdRecursion(x,y));
    }
}
