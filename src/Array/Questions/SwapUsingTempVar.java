package Array.Questions;
import java.util.Scanner ;
public class SwapUsingTempVar {
    // Given two integers a and b . Swap the two given values using
    // a temporary variable


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping : -");
        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }
}
