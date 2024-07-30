package Loops.Pattern_Printing;
import java.util.Scanner ;
public class OneTwoRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int c = sc.nextInt() ;

        int a ;
        for(int i=1; i<=r; i++){
            if(i%2==0) a = 2 ;
            else a = 1 ;
            for(int j=1; j<=c; j++){
                System.out.print(a+" ");
                if(a==1) a = 2;
                else a = 1;
            }
            System.out.println();
        }

    }
}
