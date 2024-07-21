package Basics.Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int p = 25, q = 20 , r = 15 ;


        System.out.println((p>q) && (p>r));    // true
        System.out.println((p>q) && (p<r));    // false

        System.out.println((p>q) || (p<r));     // true
        System.out.println((p<q) || (p<r));     // false

        System.out.println(!(p>q));     // false
        System.out.println(!(p<q));     // true

    }
}
