package Recursion;
import java.util.Scanner;
public class PalindromeInteger {
    static int countDigit(int n){
        int count = 0;
        while (n!=0){
            n = n/10;
            count++;
        }
        return count;
    }

    static int reverseRec(int n, int digits){
        if(digits == 1) return n;
        int lastDigit = n % 10;
        return (int) (lastDigit*Math.pow(10,digits-1) + reverseRec(n/10,digits-1));
    }

    static int reverse(int n){
        int ld = 0;
        int reverse = 0;
        while (n!=0){
            ld = n%10;
            reverse = reverse * 10 + ld;
            n = n/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int rev = reverse(n);
        int rev2 = reverseRec(n,countDigit(n));
        System.out.println(rev2);

        System.out.println("Without using recursion :");
        if(n==rev) System.out.println("Palindrome");
        else System.out.println("Not palindrome");

        System.out.println("Using recursion :");
        if(n==rev2) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
