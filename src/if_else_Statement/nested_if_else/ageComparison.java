package if_else_Statement.nested_if_else;
import java.util.Scanner;
public class ageComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // if the ages of Ram, Shyam and Ajay are input through the keyboard, WAP to determine the youngest of three
        System.out.print("Enter age of Ram : ");
        int ram = sc.nextInt();
        System.out.print("Enter age of Shyam : ");
        int shyam = sc.nextInt();
        System.out.print("Enter age of Ajay : ");
        int ajay = sc.nextInt();
        if(ram < shyam){
            if(ram > ajay) System.out.println("Ajay is youngest");
            else System.out.println("Ram is the youngest");
        }
        else{   // ram > shyam
            if(shyam > ajay) System.out.println("Ajay is the youngest");
            else System.out.println("Shyam is the youngest");
        }
    }
}
