package Recursion;
import java.util.Scanner;
public class ArmstrongNumber {
    static int isArm(int n, int digits){
        if(n<10) return (int)Math.pow(n,digits);
        return (int)Math.pow(n%10,digits) + isArm(n/10,digits);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a positive integer : ");
        int n = sc.nextInt();
        int digits = 0 ;
        int temp = n;
        while (temp != 0){
            temp = temp/10;
            digits++;
        }
        int ans = isArm(n,digits);
        System.out.println("Is Armstrong : "+ (ans == n));
    }
}
