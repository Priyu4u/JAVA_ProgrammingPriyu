package Methods;
import java.util.Scanner ;
public class SumOfTwoNum {
//    SumOfTwoNum obj = new SumOfTwoNum();
    static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt() ;
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println(a+" + "+b+" = "+sum(a,b));

    }
}
