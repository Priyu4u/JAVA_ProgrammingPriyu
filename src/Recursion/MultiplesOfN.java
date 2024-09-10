package Recursion;
import java.util.Scanner;
public class MultiplesOfN {
    static void multiple(int n, int k){     // time complexity : O[n]
        if(k==1){
            System.out.print((n)+" ");
            return;
        }
        multiple(n,k-1);
        System.out.print((n*k)+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();
        if(k==0){
            System.out.println("k should be greater than 0");
            return;
        }
        multiple(n,k);

    }
}
