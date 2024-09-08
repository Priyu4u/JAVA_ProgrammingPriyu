package Recursion;
import java.util.Scanner;
public class Power {
    static int pow(int p, int q){       // time complexity : O[q]
        if(q==0) return 1;
        return p * pow(p, q-1);
    }

    // Alternate approach
    static int pow2(int p, int q){
        if(q==0) return 1;
        int smallAns = pow2(p,q/2);
        if(q%2==0) return smallAns * smallAns;
        else return smallAns * smallAns * p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter base : ");
        int p = sc.nextInt();
        System.out.print("Enter power : ");
        int q = sc.nextInt();
        System.out.println(p+" raise to the power "+q+" = "+pow(p,q));
        System.out.println("Using Alternate method : ");
        System.out.println(p+" raise to the power "+q+" = "+pow2(p,q));

    }
}
