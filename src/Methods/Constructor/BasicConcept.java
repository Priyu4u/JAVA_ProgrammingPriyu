package Methods.Constructor;
class StuDetails{
    int id;
    int age;
    StuDetails(int stuId, int stuAge){
        this.id = stuId;
        this.age = stuAge;
        System.out.print("Student id : "+id+"\nStudent Age : "+age);
    }
}

public class BasicConcept {
    public static void main(String[] args) {
        StuDetails obj = new StuDetails(19, 21);
    }
}
