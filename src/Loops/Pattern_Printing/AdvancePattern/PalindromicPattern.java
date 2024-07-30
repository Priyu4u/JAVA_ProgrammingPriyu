package Loops.Pattern_Printing.AdvancePattern;
import java.util.Scanner ;
public class PalindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt() ;

        for(int i=1; i<=r; i++){
            for(int j=r-i; j>=1; j--){
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
