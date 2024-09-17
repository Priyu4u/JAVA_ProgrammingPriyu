package Recursion;
import java.util.Scanner;
public class KeypadCombination {
    static void combination(String dig, String[] keypad, String res){       // "253"
        if(dig.isEmpty()){
            System.out.print(res+" ");
            return;
        }
        int currNum = dig.charAt(0) - '0';     // converting string/char 2 into integer 2
        String currChoice = keypad[currNum];

        for(int i=0; i<currChoice.length(); i++){
            combination(dig.substring(1),keypad,res+currChoice.charAt(i));
        }

        // Time Complexity : O[n*4^n]
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter digits combination between 2 and 9 : ");
        String dig = sc.next();

        // creating keypad in array of String
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        System.out.println("Total possible combinations : ");
        combination(dig,keypad,"");
    }
}
