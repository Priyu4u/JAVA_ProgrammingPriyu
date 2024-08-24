package if_else_Statement;
import java.util.Scanner;
public class NumInRangeOfPowerOf2 {

    static int pow(int a , int b){
        int ans = 1;
        for(int i=0; i<=b; i++){
            ans = ans * a;
        }
        return ans ;
    }
    static boolean isPowerOf(int n){
        for(int i=0; i<=30; i++){
            int ans = pow(2,i) ;
            if(ans == n){
                return true;
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter number you want to check : ");
        int num = sc.nextInt();

        System.out.println(isPowerOf(num));

    }
}
