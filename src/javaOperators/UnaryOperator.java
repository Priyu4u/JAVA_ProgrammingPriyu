package Basics.Operators;

public class UnaryOperator {
    public static void main(String[] args) {

        int a = 6 , b = 6 ;

        System.out.println(a++);        // 6
        System.out.println(a);          // 7

        System.out.println(++b);        // 7
        System.out.println(b);          // 7

        int x = a++ ;   // 7
        int y = ++b ;   //8

        System.out.println(x);      // 7
        System.out.println(y);      // 8
        System.out.println(a);      // 8
        System.out.println(b);      // 8

    }
}
