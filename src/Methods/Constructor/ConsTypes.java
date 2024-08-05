package Methods.Constructor;
class TypeCheck{
    int id ;
    int age ;
    TypeCheck(int stuId, int stuAge){
        this.id = stuId;
        this.age = stuAge;
        System.out.println("Parameterized Constructor");
    }
    TypeCheck(){
        System.out.println("Default Constructor");
    }
}

public class ConsTypes {
    public static void main(String[] args) {

        // default constructor
        TypeCheck obj1 = new TypeCheck();

        // parameterized constructor
        TypeCheck obj2 = new TypeCheck(19,22);

    }
}
