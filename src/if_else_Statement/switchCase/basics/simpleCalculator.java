package if_else_Statement.switchCase.basics;
import java.util.Scanner;
public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create a simple calculator using java which have two numbers input and an operator
        System.out.print("Enter first number : ");
        double a = sc.nextDouble();
        System.out.print("Enter operator : ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter second number : ");
        double b = sc.nextDouble();
        switch (ch){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
