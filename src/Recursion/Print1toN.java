package Recursion;
import java.util.*;
public class Print1toN {

    static void printToN(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printToN(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        // WAP to print all the natural numbers from 1 to n using recursion
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        printToN(n);
    }
}
