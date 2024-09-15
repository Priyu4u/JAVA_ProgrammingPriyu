package Recursion.RecursionOnStrings;
import java.util.Scanner;
public class PrintSSQ {
    static void printSSQ(String s, String currAns){     // space complexity : n^2

        // base case
        if(s.isEmpty()){
            System.out.print(currAns+" ");
            return;
        }

        char curr = s.charAt(0);
        String remString = s.substring(1);

        // curr char -> chose to be part of currAns
        printSSQ(remString,currAns+curr);
        // curr char -> does not choose to be part of currAns
        printSSQ(remString,currAns);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a string : ");
        String s = sc.next();
        printSSQ(s,"");
    }
}
