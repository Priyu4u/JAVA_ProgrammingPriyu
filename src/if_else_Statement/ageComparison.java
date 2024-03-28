package if_else_Statement;
import java.util.Scanner;
public class ageComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // If the ages of Ram, Shyam and Ajay are input through the keyboard , WAP to determine the youngest of three
        System.out.print("Enter age of Ram : ");
        int ram = sc.nextInt();
        System.out.print("Enter age of Shyam : ");
        int shyam = sc.nextInt();
        System.out.print("Enter age of Ajay : ");
        int ajay = sc.nextInt();
        if(ram > shyam && ajay > shyam) System.out.println("Shyam is the youngest");
        else if(shyam > ram && ajay > ram) System.out.println("Ram is the youngest");
        else if(shyam > ajay && ram > ajay) System.out.println("Ajay is the youngest");
        else if(ram == shyam && ajay>ram) System.out.println("Ram and Shyam are youngest having same age");
        else if(ram == ajay && shyam>ram) System.out.println("Ram and ajay are youngest having same age");
        else  System.out.println("Ajay and Shyam are youngest having same age");
    }
}
