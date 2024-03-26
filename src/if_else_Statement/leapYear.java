package if_else_Statement;
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Any year is input through the keyboard. WAP to determine whether the year is leap year not.(Considering leap year occurs after every 4 years)
        System.out.print("Enter a year : ");
        int year = sc.nextInt();
        if(year % 4 == 0){
            System.out.print(year+" is a leap year");
        }
        else{
            System.out.print(year+" is not a leap year");
        }
    }
}
