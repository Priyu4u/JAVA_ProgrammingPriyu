package Array.Questions;
import java.util.Scanner ;
public class SwapWithoutTempVar {
    // Given two integers a and b . Swap the two given values
    // using sum and difference method

    static void swapWithoutTemp(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping : -");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();
        swapWithoutTemp(a,b);
    }
}
