package AccessModifiers.Package2;
import AccessModifiers.Package1.* ;



public class AccessModifier2 {
    public static void main(String[] args) {
        AccessModifier obj1 = new AccessModifier();
        Checking obj = new Checking();

        obj.print();



    }
}

class Checking extends AccessModifier2{
    AccessModifier obj = new AccessModifier();

    void print(){
        System.out.println("This is a sub-class");
        System.out.println();
    }

}