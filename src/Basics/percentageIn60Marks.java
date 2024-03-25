package Basics;

public class percentageIn60Marks {
    public static void main(String[] args) {
        // WAP to calculate the percentage of 4 subjects of 60 marks of each
        double maths = 54;
        double chem = 50;
        double phy = 59;
        double eng = 60;
        double hindi = 55;
        double percent = (maths + chem + phy + eng + hindi) / 3;
        System.out.println(percent);
    }
}
