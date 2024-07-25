package Loops;

public class ContinueStatement {
    public static void main(String[] args) {

        // Print all the values between 1 and 50 except for the multiples of 3
        int n = 1;
        while(n<=50){
            if(n%3 == 0){
                n++ ;
                continue;
            }
            System.out.print(n+" ");
            n++ ;
        }

    }
}
