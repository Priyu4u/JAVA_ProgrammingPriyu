package Array;

public class CopyingShallow {

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {


        int[] arr = {5,6,71,8,9} ;
        System.out.println("Source Array : ");
        printArray(arr);

        // trying to copy array arr in new array
        int[] arr2 = arr ;

        // printing
        System.out.println("Destination Array : ");
        printArray(arr2);

        arr2[0] = 0;
        arr2[1] = 0;

        System.out.println("Original array after making changes in copied array : ");
        printArray(arr);

        System.out.println("Copied array after making changes in copied array : ");
        printArray(arr2);



    }
}
