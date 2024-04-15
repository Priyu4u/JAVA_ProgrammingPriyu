package if_else_Statement;
import java.util.Scanner;
public class smallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take three numbers as input and print least of them
        int a, b, c;
        System.out.print("Enter first number : ");
        a = sc.nextInt();
        System.out.print("Enter second number : ");
        b = sc.nextInt();
        System.out.print("Enter third number : ");
        c = sc.nextInt();
        if(a<b && a<c) System.out.println(a+" is smallest");
        else if(b<a && b<c) System.out.println(b+" is smallest");
        else System.out.println(c+" is smallest");

    }
}
