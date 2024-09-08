package Recursion;
import java.util.Scanner;

public class PrintNto1 {
    static void printNto1(int n){
        System.out.print(n+" ");
        if(n==1){
            return;
        }
        printNto1(n-1);
    }
    public static void main(String[] args) {
        // WAP to print all the natural numbers from n to 1 using recursion
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n < 1){
            System.out.println("Invalid Input");
            return;
        }
        printNto1(n);
    }
}
