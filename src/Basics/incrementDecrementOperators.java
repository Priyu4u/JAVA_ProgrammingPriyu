package Basics;

public class incrementDecrementOperators {
    public static void main(String[] args) {
        int x = 25 ;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++ ;                   //  x++  -> x = x + 1(Post-increment)
        System.out.println(x);
        x--;                    // x--    -> x = x - 1(Post-decrement)
        System.out.println(x);
        int a = 100 ;
        System.out.println(a);
        ++a ;                    // ++a  -> a = a + 1 (Pre-increment)
        System.out.println(a);
        System.out.println(++a);   // 102
        System.out.println(a++);
        System.out.println(a);

        // x++ means use and then increment
        // ++x means increment and then use
    }
}
