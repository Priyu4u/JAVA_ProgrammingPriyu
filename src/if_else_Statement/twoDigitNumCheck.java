package if_else_Statement;
import java.util.Scanner;
public class twoDigitNumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take a positive integer input and tell if it is a two digit number or not
        System.out.print("Enter a positive integer : ");
        int n = sc.nextInt();
        if(n>9 && n<100) System.out.println(n+" is a two-digit number");
        else System.out.println(n+" is not a two-digit number");
    }
}
