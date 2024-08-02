package NumberSystem;
import java.util.Scanner ;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number : ");
        int n = sc.nextInt() ;

        int lastDigit , temp = n, ans = 0 ;
        int pow2 = 1;
        while (n>0){
            lastDigit = n % 10 ;
            ans = ans + (lastDigit * pow2) ;
            n = n / 10 ;
            pow2 = pow2 * 2;
        }
        System.out.println("Decimal conversion of "+temp+" = "+ans);


    }
}
