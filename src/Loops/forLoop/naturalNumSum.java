package Loops.forLoop;
import java.util.Scanner;
public class naturalNumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Print the sum of first n natural numbers, where n is the input
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
