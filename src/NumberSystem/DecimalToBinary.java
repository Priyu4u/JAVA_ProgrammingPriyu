package NumberSystem;
import java.util.Scanner ;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number from decimal system: ");
        int n = sc.nextInt() ;

        int temp = n;
        int pow = 1;
        int ans = 0;
        while (n>0){
            int r = n % 2;
            ans = ans + (r*pow) ;
            pow *= 10;
            n/=2;
        }
        System.out.println("Binary Conversion of "+temp+" = "+ans);


    }
}
