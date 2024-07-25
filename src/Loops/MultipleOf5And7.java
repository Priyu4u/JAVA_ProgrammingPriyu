package Loops;
import java.util.Scanner ;
public class MultipleOf5And7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print the first multiple of 5 which is also a multiple of 7
        int res = 1 ;
        for(int i=1; ; i++){
            res = 5 * i ;
            if(res % 7 == 0)
                break;
        }
        System.out.println("first multiple of 5 which is also a multiple of 7 is "+res);

    }
}
