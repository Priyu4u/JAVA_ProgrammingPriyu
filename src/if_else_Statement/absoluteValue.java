package if_else_Statement;
import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take integer input and print the absolute value of that integer
        System.out.print("Enter an integer : ");
        int a = sc.nextInt();
        int b = a;
        if(a<0) a = -a;
        System.out.println("Absolute value of "+b+" is "+a);
    }
}
