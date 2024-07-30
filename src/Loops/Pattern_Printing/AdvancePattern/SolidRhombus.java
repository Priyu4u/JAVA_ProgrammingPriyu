package Loops.Pattern_Printing.AdvancePattern;
import java.util.Scanner ;
public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=r-i; j>0; j--){
                System.out.print("  ");
            }
            for(int j=1; j<=r; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
