package if_else_Statement;
import java.util.Scanner;
public class threeDigitNumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take positive integer input and tell if it is a three-digit number or not
        System.out.print("Enter a positive integer : ");
        int a = sc.nextInt();
        if(a>99 && a<1000) System.out.println(a+" is a three digit number");
        else System.out.println(a+" is not a three digit number");
    }
}
