package Loops.Problems;
import java.util.Scanner ;
public class SumOfSeries2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Find the sum of the following series
        // 1 - 2 + 3 - 4 .... n
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt() ;

        if(n%2 == 0)
            System.out.println("Sum of series = "+ -n/2);
        else
            System.out.println("Sum of series = "+ (n+1)/2 );

    }
}
