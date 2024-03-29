package if_else_Statement;
import java.util.Scanner;
public class classificationByAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // WAP to divide people into 3 age groups depending upon their age
        // below 12-> child, between 12 and 18 -> teenager, above 18 -> adult
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age <= 12) System.out.println("Child");
        else if(age > 12 && age < 18) System.out.println("Teenager");
        else System.out.println("Adult");

    }
}
