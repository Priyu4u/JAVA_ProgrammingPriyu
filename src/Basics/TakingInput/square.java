package Basics.TakingInput;
import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // WAP to take input of a number from user and display its square
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("Square = "+(a*a));

    }
}
