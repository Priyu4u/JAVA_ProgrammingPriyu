package Array.Questions;

public class SumOfElements {
    public static void main(String[] args) {
        int arr[] = {1,5,3,23,35,52,19} ;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i] ;
        }
        System.out.println("Sum of elements = "+sum);
    }
}
