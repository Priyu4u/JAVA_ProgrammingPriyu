package Recursion;
import java.util.Scanner;
public class FrogJump {
    static int minCost(int[] h,int n, int idx){             // Time Complexity : O[2^n]
        if(idx == n-1) return 0;
        int opt1 = Math.abs(h[idx] - h[idx+1]) + minCost(h,n,idx+1);
        if(idx == n-2) return opt1;
        int opt2 = Math.abs(h[idx] - h[idx+2]) + minCost(h,n,idx+2);
        return Math.min(opt2,opt1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter number of stones : ");
        int n = sc.nextInt();
        int[] h = new int[n];
        System.out.println("Enter height of "+n+" stones : ");
        for(int i=0; i<n; i++){
            h[i] = sc.nextInt();
        }
        System.out.println("Minimum cost incurred : "+minCost(h,n,0));
    }
}
