package Methods.PassByValueAndReference;

class Pass{
    static void change(int a){
        a *= 100;
        System.out.println("Value changing in method : "+a);
    }
}

public class main {
    public static void main(String[] args) {
        Pass obj = new Pass();
        int a = 10;
        System.out.println("Before changing value : "+a);
        obj.change(a);   // pass by value
        System.out.println("After changing value : "+a);
    }
}
