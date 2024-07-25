package Loops.Problems;
import java.util.Scanner ;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Find the sum of the following series
        // 1 - 2 + 3 - 4 .... n

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt() ;

        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2 == 0)
                sum = sum - i ;
            else
                sum = sum + i ;
        }
        System.out.println(sum);

    }
}
