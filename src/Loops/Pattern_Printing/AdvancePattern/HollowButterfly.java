package Loops.Pattern_Printing.AdvancePattern;
import java.util.Scanner ;
public class HollowButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                if(j==1 || i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j=1; j<=2*(r-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                if(j==1 || i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(j==1 || i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j=1; j<=2*(r-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                if(j==1 || i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }


    }
}
