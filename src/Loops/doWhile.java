package Loops;
import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // do while loop
        // code executes in first iteration whether the condition is true or false
        int n = 100;
        do{
            System.out.println(n);
            n++;
        }while (n<10) ;
    }
}
