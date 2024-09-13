package Recursion.RecursionOnStrings;
import java.util.Scanner;
public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = "Priyanshu Gupta";
        System.out.println(s);

        System.out.println("Enter your name : ");
        String str = sc.nextLine();
        System.out.println(str);

        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }

        System.out.println();
        System.out.println(s.substring(4,10));
        // 4 is inclusive and 10 is exclusive(end index is optional,
        // if you will not provide end index , it prints all elements to end)


    }
}
