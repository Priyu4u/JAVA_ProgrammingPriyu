package Basics.Operators;
import java.util.Scanner ;
public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Operators
        int a = 24 , b = 10 ;
        // Arithmetic Operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        a++ ;
        b-- ;
        System.out.println(a);
        System.out.println(b);

        System.out.println(++a);
        System.out.println(--b);

        System.out.println(a--);
        System.out.println(b++);

        System.out.println(a);
        System.out.println(b);


    }
}
