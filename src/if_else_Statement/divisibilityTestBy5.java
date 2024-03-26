package if_else_Statement;
import java.util.Scanner;
public class divisibilityTestBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take a positive integer input and tell if it is divisible by 5 or not
        System.out.print("Enter a positive integer : ");
        int a = sc.nextInt();
        if(a % 5 != 0){
            System.out.print(a+" is not divisible by 5");
        }
        else{
            System.out.print(a+" is divisible by 5");
        }
    }
}
