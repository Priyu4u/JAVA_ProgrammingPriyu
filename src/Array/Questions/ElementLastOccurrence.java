package Array.Questions;

import java.util.Scanner;

public class ElementLastOccurrence {

    // Find the last occurrence of element x in a given array

    static void elementLastOccurrence(int[] arr, int x){
        int lastIdx = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x) lastIdx = i ;
        }
        if(lastIdx >= 0){
            System.out.println("Element "+x+" has last occurred at index "+lastIdx);
        } else{
            System.out.println("Element "+x+" is not present in the array");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Count the number of occurrence of a particular element x
        int[] arr = {22, 45, 85, 12, 45, 41, 65, 85, 45, 11, 63, 11 } ;
        System.out.print("Enter element you want to search : ");
        int x = sc.nextInt();
        elementLastOccurrence(arr, x);
    }
}
