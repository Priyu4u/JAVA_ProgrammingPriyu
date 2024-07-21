package Loops;
import java.util.Scanner;
public class primeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // WAP to check is a number is prime or not
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=2; i<n-1; i++){
            if(n%i==0){
                System.out.println(n+" is a composite number");
                break;
            }
            else {
                System.out.println(n+" is a prime number");
                break;
            }
        }
    }
}
