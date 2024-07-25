package Loops;
import java.util.Scanner ;
public class MultipleOf5And7two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print the first multiple of 5 which is also a multiple of 7
        int num = 1;
        while(true){
            if(num % 5 == 0 && num % 7 == 0){
                System.out.println("first multiple of 5 which is also a multiple of 7 is "+num);
                break;
            }
            num++ ;
        }



    }
}
