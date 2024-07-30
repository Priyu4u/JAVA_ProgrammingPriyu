package Loops.Pattern_Printing.AdvancePattern;
import java.util.Scanner ;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();

        int num = 1;
        for(int i=0; i<r; i++){
            // spaces
            for(int j=1; j<=r-i-1; j++){
                System.out.print("  ");
            }
            // number
            for(int j=0; j<=i; j++){
                if(j==0){
                    num = 1;
                }
                else{
                    num = num * (i-j+1) / j ;
                }
                System.out.print(num+"   ");
            }
            System.out.println();

        }

    }
}
