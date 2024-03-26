package if_else_Statement;
import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        // take a positive integer input and tell if it is even or odd
        System.out.print("Enter a positive integer : ");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.print(a+" is an even number");
        }
        else{
            System.out.print(a+" is an odd number");
        }
    }
}
