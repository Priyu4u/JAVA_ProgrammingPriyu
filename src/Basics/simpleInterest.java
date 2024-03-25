package Basics;

public class simpleInterest {
    public static void main(String[] args) {
        // WAP to calculate the simple interest
        double principal, rate, time ;
        principal = 100 ;
        rate = 18;
        time = 3;
        double si = (principal * rate * time) / 100 ;
        System.out.println(si);
    }
}
