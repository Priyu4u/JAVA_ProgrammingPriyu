package Recursion;
import java.util.Scanner;
public class SumAlternateSign {

    static int sumAlter(int n){             // time complexity : O[n]
        if(n==1) return 1;
        if(n%2 != 0) return sumAlter(n-1) + n;
        else return sumAlter(n-1) - n;
    }

    static void alternateSum(int n){
        if(n%2==0){
            System.out.println(-n/2);
            return;
        }
        System.out.println((n+1)/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n<=0 || n>=1000000){
            System.out.println("Invalid input of n !");
            return;
        }
        System.out.print("Without using recursion : ");
        alternateSum(n);
        System.out.println("Using recursion : "+sumAlter(n));

    }
}
