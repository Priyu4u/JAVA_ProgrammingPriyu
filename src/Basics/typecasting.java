package Basics;
import java.util.Scanner;
public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take integer 'x' as input and print half of the number
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.println("Half of "+x+" is "+(double)x/2);
    }
}
