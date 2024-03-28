package if_else_Statement;
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Take input percentage of a student and print the Grade according to marks:
        91 - 100 Excellent
        81 - 90 Very Good
        71 - 80 Good
        61 - 70 Can do better
        51 - 60 Average
        41 - 50 Below Average
        < 40 Fail
         */
        System.out.print("Enter percentage : ");
        double percent = sc.nextDouble();
        if(percent<0 || percent>100) System.out.println("Invalid Input");
        else if(percent > 90) System.out.println("Excellent");
        else if(percent > 80) System.out.println("Very Good");
        else if(percent > 70) System.out.println("Good");
        else if(percent > 60) System.out.println("Can do better");
        else if(percent > 50) System.out.println("Average");
        else if(percent > 40) System.out.println("Below Average");
        else System.out.println("Fail");
    }
}
