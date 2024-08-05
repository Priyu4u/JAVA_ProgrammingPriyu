package Methods;
import java.util.Scanner ;
public class welcomeMsg {

    public static void Greeting(String fName){
        System.out.println("Hello "+fName+", Welcome to Growthers Academy");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        Greeting(name);
    }
}
