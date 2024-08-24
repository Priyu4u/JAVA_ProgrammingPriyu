package Array;

import java.util.Arrays;

public class CopyingDeep2 {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {


        int[] arr = {5, 6, 71, 8, 9};
        System.out.println("Source Array : ");
        printArray(arr);

        // trying to copy array arr in new array by clone method
        int[] arr2 = Arrays.copyOf(arr, arr.length);

        // printing
        System.out.println("Destination Array : ");
        printArray(arr2);

        arr2[0] = 0;
        arr2[1] = 0;

        System.out.println("Original array after making changes in copied array : ");
        printArray(arr);

        System.out.println("Copied array after making changes in copied array : ");
        printArray(arr2);


        System.out.println("\n \nUsing copy of range method : ");
        int[] arr3 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println("Third array using Array.copyOfRange method :");
        printArray(arr3);


    }
}
