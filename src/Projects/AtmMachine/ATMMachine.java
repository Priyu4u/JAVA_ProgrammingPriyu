package Projects.AtmMachine;
import java.util.Scanner;

// A very basic project just using concept of classes and object and basics of JAVA

class ATM{
    Scanner sc = new Scanner(System.in);
    float Balance ;
    int PIN = 2435;

    public void checkPin(){

        System.out.print("Enter your PIN : ");
        int enteredPIN = sc.nextInt();
        if(enteredPIN == PIN){
            menu();
        }else{
            System.out.println("Invalid PIN Number !");
            checkPin();
        }

    }

    public void menu(){
        System.out.println();
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Deposit Amount");
        System.out.println("4. Exit");
        System.out.print("Enter your choice : ");

        int opt = sc.nextInt();
        if(opt == 1){
            checkBalance();
        }else if(opt == 2){
            withdrawMoney();
        }else if(opt == 3){
            depositMoney();
        }else if(opt == 4){
            return;
        }else{
            System.out.println("Enter a valid choice !");
        }

    }

    public void checkBalance(){
        System.out.println("\nAccount Balance : "+Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.print("\nEnter amount to withdraw : ");
        float amount = sc.nextFloat();
        if(amount > Balance){
            System.out.println("Insufficient Balance !");
        }else{
            Balance = Balance - amount;
            System.out.println("Money withdraw is successful !");
        }
        menu();
    }
    public void depositMoney(){
        System.out.print("\nEnter Amount you want to Deposit : ");
        float deposit = sc.nextFloat();
        Balance = Balance + deposit;
        System.out.println("Money deposited successfully !");
        menu();
    }

}


public class ATMMachine {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkPin();

    }
}
