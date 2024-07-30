package Loops.Pattern_Printing.AdvancePattern;
import java.util.Scanner ;
public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=r; j++){
                if(j==1 || i==1 || j==r || i==r){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
