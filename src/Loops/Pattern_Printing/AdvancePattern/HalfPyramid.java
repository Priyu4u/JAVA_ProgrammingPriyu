package Loops.Pattern_Printing.AdvancePattern;
import java.util.Scanner;
public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt() ;

        for(int i=1; i<=r; i++){
            // spaces
            for(int j=1; j<=r-i; j++){
                System.out.print("  ");
            }
            // number
            for(int j=1; j<=i; j++){
                System.out.print(j+"   ");
            }
            System.out.println();
        }

    }
}
