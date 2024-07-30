package Loops.Pattern_Printing;
import java.util.Scanner ;
public class NumRecTough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt() ;

        for(int i=1; i<=r; i++){
            for(int j=i; j<=r; j++){
                System.out.print(j+" ");
            }
            for(int j=1; j<=i-1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
