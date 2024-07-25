package Loops;
import java.util.Scanner ;
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt() ;

        do {
            System.out.println(n);
            n++ ;
        }while (n<=10) ;

    }
}
