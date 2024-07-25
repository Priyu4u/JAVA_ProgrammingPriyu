package Loops;
import java.util.Scanner ;
public class StreamIntSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print the sum of stream of integers in the input
        System.out.print("Enter stream of numbers(-1 to terminate) : ");
        int n = sc.nextInt() ;

        int sum = 0;
        while(n != -1){
            sum = sum + n ;
            n = sc.nextInt() ;
        }
        System.out.println("Sum = "+sum);

    }
}
