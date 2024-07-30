package Loops.Pattern_Printing;
import java.util.Scanner ;
public class InverseTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=r+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        /*
        for(int i=1; i<=r; i++){
            for(int j=r; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        */

    }
}
