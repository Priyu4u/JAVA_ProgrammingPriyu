package if_else_Statement;
import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // if cost price and selling price of an item is input through the keyboard, WAP to determine whether the seller has made profit or incurred loss. Also determine how much profit he made or loss he incurred
        System.out.print("Enter cost price : ");
        double cp = sc.nextDouble();
        System.out.print("Enter selling price : ");
        double sp = sc.nextDouble();
        if(sp>cp) System.out.print("Profit of "+(sp - cp));
        else if(cp>sp) System.out.print("Loss of "+(cp - sp));
        else System.out.print("Neither profit nor loss");
    }
}
