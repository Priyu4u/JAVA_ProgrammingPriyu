package if_else;
import java.util.Scanner ;
public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt() ;

        String ans ;
        ans = (num % 2 == 0) ? "even" : "odd" ;
        System.out.println(ans);

    }
}
