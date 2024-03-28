package if_else_Statement;
import java.util.Scanner;
public class divisibilityBy5or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take positive integer input and tell if it is divisible by 5 or 3
        System.out.print("Enter a positive integer : ");
        int n = sc.nextInt();
        if(n % 5 == 0 || n % 3 == 0) System.out.println(n+" is divisible by 5 or 3");
        else System.out.println("It does not satisfy the given condition");
    }
}
