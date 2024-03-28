package if_else_Statement;
import java.util.Scanner;
public class divisibilityBy5ButNot3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // WAP to input a number and tell if it is divisible by 5 but not divisible by 3
        System.out.print("Enter a positive integer : ");
        int num = sc.nextInt();
        if(num % 5 == 0 && num % 3 != 0){
            System.out.println(num+" is divisible by 5 but not divisible by 3");
        }
        else{
            System.out.println("It does not satisfy the given condition");
        }
    }
}
