package OOPS_Intro;

class Student{
    int rollNo ;
    String sName ;
}

public class Main {
    // multiple classes can be created inside a java file but
    // only one class should be public class with same name as file name

    public static void main(String[] args) {
        Student Ram = new Student();           // object Ram of class Student
        Ram.rollNo = 1;
        Ram.sName = "Ram Kumar" ;
        System.out.println(Ram.rollNo);
        System.out.println(Ram.sName);

        Student Priya = new Student();      // object Priya of class Student
        Priya.rollNo = 2;
        Priya.sName = "Priya";
        System.out.println(Priya.rollNo);
        System.out.println(Priya.sName);
    }

}
