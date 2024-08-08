package Array;

public class CopyingByMethodCall {
    static void zeroArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = 0 ;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[3] ;
        arr[0] = 45;
        arr[1] = 20;
        arr[2] = 67;

        System.out.println("Before method call :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        zeroArray(arr);
        System.out.println();

        System.out.println("After method call :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
