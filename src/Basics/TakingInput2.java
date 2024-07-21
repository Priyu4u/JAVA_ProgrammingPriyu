package Basics;
import java.util.Scanner ;
public class TakingInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        System.out.println("Hello "+sc.nextLine());
    }
}
