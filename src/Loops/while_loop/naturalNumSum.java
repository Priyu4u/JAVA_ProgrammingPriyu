package Loops.while_loop;
import java.util.Scanner;
public class naturalNumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Print the sum of first n natural numbers, where n is the input
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int sum = 0, i = 1;
        while (i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
