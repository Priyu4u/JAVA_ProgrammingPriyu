package Loops;
import java.util.Scanner ;
public class First_n_NaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print the first n natural number by taking n as input from user
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt() ;

        int i = 1 ;
        while (i<=n){
            System.out.print(i+" ");
            i++ ;
        }

    }
}
