package Basics.charDataType;
import java.util.Scanner;
public class charDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // char data type is used to store character values
        char ch = 'a' ;  // only a single character
        System.out.println(ch);
        // TYPECASTING
        int x = (int)ch;
        System.out.println(x);

        // taking a character input
        // a b c d e f g h i j k l m n o p q r s t u v w x y z
        // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        // ! @ # $ % ^ & * ( ) _ + - / ? > < [ ] { } | \ . , ` " '
        // 0 1 2 3 4 5 6 7 8 9

        //taking a character input from user
        char c = sc.next().charAt(0);
        System.out.println(c);


        // ASCII VALUES
        // a -> 97
        // A -> 65




    }
}
