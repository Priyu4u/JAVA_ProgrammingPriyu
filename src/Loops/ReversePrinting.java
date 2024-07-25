package Loops;
import java.util.Scanner ;
public class ReversePrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print n to 1, where n is input
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt() ;


        for(int i=n; i>=1; i--){
            System.out.print(i+" ");
        }

    }
}
