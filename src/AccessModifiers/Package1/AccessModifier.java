package AccessModifiers.Package1;

class AccModCheck{
    public int a = 1;
    private int b = 2;          // accessibility of private in within this class only
    protected int c = 3;
    int d = 4;
    void print(){
        System.out.println(b);
    }
}


public class AccessModifier {
    public static void main(String[] args) {


        AccModCheck obj1 = new AccModCheck();
        System.out.println("Value of a(public) : "+obj1.a);
        System.out.println("Value of b(private) : ");
        System.out.println("Value of c(protected) : "+obj1.c);
        System.out.println("Value of d(default) : "+obj1.d);

        obj1.print();
        int m = 7;
    }
}
