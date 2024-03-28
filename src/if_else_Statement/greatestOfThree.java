package if_else_Statement;
import java.util.Scanner;
public class greatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take three positive integers input and print the greatest of them
        System.out.print("Enter three positive integers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b && b==c) System.out.println("All the inputs are same");
        else if(a>b && a>c) System.out.println(a+" is greatest");
        else if(b>a && b>c) System.out.println(b+" is greatest");
        else System.out.println(c+" is greatest");
    }
}
