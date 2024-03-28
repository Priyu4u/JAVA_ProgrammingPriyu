package if_else_Statement;
import java.util.Scanner;
public class divisibilityCheckBy5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take positive integer input and tell if it is divisible by 5 and 3
        System.out.print("Enter a positive integer : ");
        int n = sc.nextInt();
        if(n % 5 == 0 && n % 3 == 0) System.out.println(n+" is divisible by 5 and 3 both");
        else System.out.println(n+" is not divisible by 5 and 3");

    }
}
