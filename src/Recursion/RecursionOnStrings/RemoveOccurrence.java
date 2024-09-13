package Recursion.RecursionOnStrings;
import java.util.Scanner;
// remove all occurrences of 'a' from a given string

public class RemoveOccurrence {
    static String removeA2(String s){               // time complexity : O[n^2]
        if(s.isEmpty()) return "";
        String smallAns = removeA2(s.substring(1));
        char currChar = s.charAt(0);
        if(currChar != 'a'){
            return currChar + smallAns;
        } else{
            return smallAns;
        }
    }
    static String removeA(String s,int idx){        // time complexity : O[n^2]
        if(idx == s.length()) return "";
        if(s.charAt(idx) == 'a') return removeA(s,idx+1);
        else return s.charAt(idx)+removeA(s,idx+1);
    }
    static void removeBruteForce(String s){
        String ans ="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != 'a'){
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        System.out.print("Using brute force method : ");
        removeBruteForce(s);
        System.out.print("Using recursion method : "+removeA(s,0));
        System.out.println();
        System.out.print("Using recursion without idx variable method : "+removeA2(s));

    }
}
