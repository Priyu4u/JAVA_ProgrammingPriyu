package Methods;
import java.util.Scanner ;
class Algebra{
    float a , b;
    Algebra(float x, float y){
        System.out.println("Constructor Algebra is called");
        this.a = x;
        this.b = y;
    }


    float add(){
        return a + b ;
    }
    float difference(){
        return a - b ;
    }
    float product(){
        return a * b;
    }
    float divide(){
        return a / b;
    }
}
public class Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first number : ");
        float m = sc.nextFloat();
        System.out.print("Enter second number : ");
        float n = sc.nextFloat();
        Algebra obj1 = new Algebra(m,n);

        float sum = obj1.add();
        System.out.println("Sum of "+m+" and "+n+" = "+sum);

        float difference = obj1.difference();
        System.out.println("Difference of "+m+" and "+n+" = "+difference);

        float product = obj1.product();
        System.out.println("Product of "+m+" and "+n+" = "+product);

        float division = obj1.divide();
        System.out.println("Division of "+m+" and "+n+" = "+division);



    }
}
