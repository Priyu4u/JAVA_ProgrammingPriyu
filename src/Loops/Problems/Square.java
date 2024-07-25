package Loops.Problems;
import java.util.Scanner ;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Given 2 no. a and b . Find a raise to the power b
        System.out.print("Enter the value of base : ");
        int a = sc.nextInt() ;
        System.out.print("Enter the value of power : ");
        int pow = sc.nextInt();

        int res = 1;
        for(int i=1; i<=pow; i++){
            res = res * a;
        }
        System.out.println(a+" raise to the power "+pow+" = "+res);

    }
}
