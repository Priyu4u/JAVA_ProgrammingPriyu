package Recursion;
import java.util.Scanner;
public class SumOfDigits {
    static int digitSum(int n){
        n = Math.abs(n);
        if(n/10 == 0) return n;
        return (n%10) + digitSum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter an integer : ");
        int n = sc.nextInt();
        System.out.println("Sum of digits : "+digitSum(n));
    }
}
