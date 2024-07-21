package Basics.Operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10 , b = 20, c ;

        c = a + b ;
        System.out.println(c);          // 30
        System.out.println(a+=b);       // 30

        System.out.println(a-=b);       // 10
        System.out.println(a*=b);       // 200
        System.out.println(a/=b);       // 10
        System.out.println(c%=b);       // 10

    }
}
