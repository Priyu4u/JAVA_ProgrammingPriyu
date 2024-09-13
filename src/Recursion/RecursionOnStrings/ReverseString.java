package Recursion.RecursionOnStrings;
import java.util.Scanner;
public class ReverseString {

    static String reverseString(String s, int idx){
        if(idx == s.length()) return "";
        return reverseString(s,idx+1) + s.charAt(idx);
    }
    static void reversePrint(String s, int idx){
        if(idx < 0) return;
        System.out.print(s.charAt(idx));
        reversePrint(s,idx-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        System.out.print("Reverse of given string : ");
        reversePrint(s,s.length()-1);
        System.out.println();
        System.out.print("Reverse of given string method 2 : "+reverseString(s,0));

    }
}
