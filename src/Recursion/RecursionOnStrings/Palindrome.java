package Recursion.RecursionOnStrings;
import java.util.Scanner;
public class Palindrome {
    static boolean palindrome(String s, int l, int r){
        if(l>=r) return true;
        if(s.charAt(l) != s.charAt(r)) return false;
        return palindrome(s,l+1,r-1);
    }
    static String reverseString(String s, int idx){
        if(idx == s.length()) return "";
        return reverseString(s,idx+1) + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        String reverse = reverseString(s,0);
        System.out.println("Without using recursion : ");
        if(reverse.equals(s)) System.out.println(s+" is Palindrome");
        else System.out.println(s+" is not Palindrome");
        System.out.println("Using recursion : ");
        if(palindrome(s,0,s.length()-1)) System.out.println(s+" is Palindrome");
        else System.out.println(s+" is not Palindrome");
    }
}
