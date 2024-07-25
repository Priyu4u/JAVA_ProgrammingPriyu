package Loops.Problems;
import java.util.Scanner ;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // WAP to reverse the digits of a number
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int temp = n ;

        int rem , reverse = 0;
        while (n > 0){
            rem = n % 10 ;
            reverse = (reverse * 10) + rem ;
            n = n / 10 ;
        }
        System.out.println("Reverse of this number : "+reverse);
    }
}
