package if_else;
import java.util.Scanner ;
public class DivBy3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // WAP to print the value if it is divisible by 3 or 5
        System.out.print("Enter a number : ");
        int n = sc.nextInt() ;

        if(n%3 == 0 || n%5 == 0){
            System.out.println("It is divisible by 3 or 5");
        } else {
            System.out.println("It does not satisfy the given codition");
        }


    }
}
