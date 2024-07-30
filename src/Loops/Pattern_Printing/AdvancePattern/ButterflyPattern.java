package Loops.Pattern_Printing.AdvancePattern;
import java.util.Scanner ;
public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int k=1; k<=2*(r-i); k++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r+1-i; j++){
                System.out.print("* ");
            }
            for(int k=1; k<=2*i-2; k++){
                System.out.print("  ");
            }
            for(int j=1; j<=r+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
