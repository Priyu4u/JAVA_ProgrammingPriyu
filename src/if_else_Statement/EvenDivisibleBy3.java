package if_else;
import java.util.Scanner ;
public class EvenDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // WAP to print the value if it is even and divisible by 3

        System.out.print("Enter a number : ");
        int n = sc.nextInt() ;

        if(n % 2 == 0 && n % 3 == 0){
            System.out.println("It is even and divisible by 3");
        }else {
            System.out.println("It does not satisfy the given condition");
        }

    }
}
