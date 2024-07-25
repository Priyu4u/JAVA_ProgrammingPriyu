package Loops;
import java.util.Scanner ;
public class SumOfFirst_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print the sum of first n natural numbers, where n is the input
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt() ;

        int i = 1 ,sum = 0;
        while(i<=n){
            sum = sum + i ;
            i++ ;
        }
        System.out.println("Sum of first "+n+" natural number is "+sum);

    }
}
