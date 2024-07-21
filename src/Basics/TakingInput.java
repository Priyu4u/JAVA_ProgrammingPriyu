package Basics;
import java.util.Scanner ;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer Input
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("You entered : "+num);

        // String Input
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.println("You entered : "+name);
        // This method will not read anything after white space

        // Consume the leftover newline character
        sc.nextLine() ;

        // String Input to take whole sentence
        System.out.print("Enter full name : ");
        String fullName = sc.nextLine();
        System.out.println("Hello "+fullName);

    }
}
