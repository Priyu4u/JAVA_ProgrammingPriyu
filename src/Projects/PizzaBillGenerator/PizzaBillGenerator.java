package Projects.PizzaBillGenerator;
import java.util.Scanner ;
class Pizza{
    Scanner sc = new Scanner(System.in) ;

    StringBuilder billDetails = new StringBuilder();
    public int totalBill = 0;
    public int pizzaType ;
    int extraCheese = 100;
    int extraTomOnion = 60;
    int extraSausage = 50;
    int packing = 20;
    public Pizza(){
        System.out.println();
        System.out.println("1. Basic Pizza          (Price : 180)");
        System.out.println("2. Margherita Pizza     (Price : 300)");
        System.out.println("3. Meat Pizza           (Price : 380)");
        System.out.println("4. BBQ Chicken Pizza    (Price : 450)");
        System.out.println();
        System.out.print("Select Pizza Type : ");
        pizzaType = sc.nextInt();
        if(pizzaType == 1){
            totalBill += 180;
            billDetails.append("Basic Pizza             :   Rs 180\n");
            basicPizza();
        } else if(pizzaType == 2){
            totalBill += 300;
            billDetails.append("Margherita Pizza        :   Rs 300\n");
            margheritaPizza();
        } else if(pizzaType == 3){
            totalBill += 380;
            billDetails.append("Meat Pizza              :   Rs 380\n");
            meatPizza();
        } else if(pizzaType == 4){
            totalBill += 450;
            billDetails.append("BBQ Chicken Pizza       :   Rs 450\n");
            bbqChickenPizza();
        } else{
            System.out.println("Please Select Valid Pizza Type !");
            System.out.println();
            new Pizza();
        }


    }

    void extraAddedItems(){
        while (true){
            System.out.println("\nWould you like to add extra items !");
            System.out.println("1. Add extra cheese            (Worth Rs 100)");
            System.out.println("2. Add extra tomato and onion  (Worth Rs 60)");
            System.out.println("3. Add extra catchup           (Worth Rs 50)");
            System.out.println("4. Want packing                (Worth Rs 20)");
            System.out.println("5. Generate Bill");
            System.out.print("Please enter your choice : ");
            int extraItems = sc.nextInt();
            if(extraItems == 1){
                System.out.println("Extra cheese added Successfully !");
                totalBill = totalBill + extraCheese ;
                billDetails.append("Extra cheese            :   Rs 100\n");
            } else if(extraItems == 2){
                System.out.println("Extra tomato and onion added Successfully !");
                totalBill = totalBill + extraTomOnion ;
                billDetails.append("Extra tomato and onion  :   Rs 60\n");
            } else if(extraItems == 3){
                System.out.println("Extra catchup added Successfully !");
                totalBill = totalBill + extraSausage ;
                billDetails.append("Extra catchup           :   Rs 50\n");
            } else if(extraItems == 4){
                System.out.println("Packing Added Successfully !");
                totalBill = totalBill + packing ;
                billDetails.append("Packing                 :   Rs 20\n");
            } else if(extraItems == 5){
                generatedBill();
                break;
            } else{
                System.out.println("Please select valid options !");
            }
        }

    }

    public void basicPizza(){

        System.out.println("\nYou selected : Basic Pizza");
        extraAddedItems();
    }
    public void margheritaPizza(){

        System.out.println("\nYou selected : Margherita Pizza");
        extraAddedItems();
    }
    public void meatPizza(){

        System.out.println("\nYou selected : Meat Pizza");
        extraAddedItems();
    }
    public void bbqChickenPizza(){

        System.out.println("\nYou selected : BBQ Chicken Pizza");
        extraAddedItems();
    }
    public void generatedBill(){
        System.out.println("\n        --- Bill Summary ---");
        System.out.println(billDetails.toString());
        System.out.println("Total Payable Amount    :   Rs "+totalBill);
        System.out.println("               ------          ");
    }

}
public class PizzaBillGenerator {
    public static void main(String[] args) {
        Pizza obj = new Pizza();
    }
}
