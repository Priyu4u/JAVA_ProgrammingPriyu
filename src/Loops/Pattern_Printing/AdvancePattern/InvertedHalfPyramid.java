package Loops.Pattern_Printing.AdvancePattern;
import java.util.Scanner ;
public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++){

            for(int j=1; j<=r+1-i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
