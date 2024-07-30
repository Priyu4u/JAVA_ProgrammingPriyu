package Loops.Pattern_Printing;
import java.util.Scanner ;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt() ;

        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
