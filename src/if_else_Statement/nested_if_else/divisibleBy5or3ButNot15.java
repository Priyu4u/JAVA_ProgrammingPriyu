package if_else_Statement.nested_if_else;
import java.util.Scanner;
public class divisibleBy5or3ButNot15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take positive integer input and tell if it is divisible by 5 or 3 but not divisible by 15
        System.out.print("Enter a positive integer : ");
        int n = sc.nextInt();
//        if(n%5==0 || n%3==0){
//            if(n%15 != 0) System.out.println(n+" is divisible by 5 or 3 but not 15");
//            else System.out.println(n+" does not satisfy the given condition");
//        }
//        else System.out.println(n+" does not satisfy the given condition");
        if((n%5==0 || n%3==0) && n%15!=0)  System.out.println(n+" is divisible by 5 or 3 but not 15");
        else System.out.println(n+" does not satisfy the given condition");
    }
}
