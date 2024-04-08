package Loops.while_loop;
import java.util.Scanner;
public class first_n_NaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Print the first n natural numbers
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
