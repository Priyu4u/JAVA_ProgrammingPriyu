package Array.Questions;

import java.util.Scanner;
public class ElementOccurrence {
    static void elementOccurrence(int[] arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x) count++ ;
        }
        System.out.println("Element "+x+" has occurred "+count+" times");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Count the number of occurrence of a particular element x
        int[] arr = {12, 45, 85, 12, 45, 41, 65, 85, 45, 11, 63, 11 } ;
        System.out.print("Enter element you want to search : ");
        int x = sc.nextInt();
        elementOccurrence(arr, x);

    }
}
