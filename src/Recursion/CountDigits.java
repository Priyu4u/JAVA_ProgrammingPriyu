package Recursion;
import java.util.Scanner;
public class CountDigits {
    static int countDigits(int n){
        if(n>=0 && n<=9) return 1;
        return countDigits(n/10) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter an integer : ");
        int n = sc.nextInt();
        System.out.println("Number of digits : "+countDigits(n));
    }
}
