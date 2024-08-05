package AccessModifiers.Package1;
import AccessModifiers.Package1.AccModCheck ;


public class CheckingAccess2 {
    public static void main(String[] args) {
        AccModCheck obj1 = new AccModCheck();

        System.out.println("Value of a(public) : "+obj1.a);
        System.out.println("Value of b(private) : ");
        System.out.println("Value of c(protected) : "+obj1.c);
        System.out.println("Value of d(default) : "+obj1.d);

    }
}
