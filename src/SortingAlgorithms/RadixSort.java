package SortingAlgorithms;

public class RadixSort {
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static int findMax(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }
    static void countSort(int[] arr, int place){
        int n = arr.length;
        int[] output = new int[n];

        // making frequency array
        int[] frequency = new int[10];
        for(int i=0; i<n; i++){
            frequency[(arr[i]/place)%10]++ ;
        }
        // make prefix sum array of frequency array
        for(int i=1; i<10; i++){
            frequency[i] += frequency[i-1];
        }

        // find the index of each element in original array and put it in the output array
        for(int i=n-1; i>=0; i--){
            int idx = frequency[(arr[i]/place)%10] - 1 ;
            output[idx] = arr[i];
            frequency[(arr[i]/place)%10]-- ;       // decrement after using once
        }

        // copy all elements of output to array
        for(int i=0; i<output.length; i++){
            arr[i] = output[i];
        }


    }

    static void radixSort(int[] arr){
        int max = findMax(arr); // find maximum element

        // apply counting sort to sort value based on counting sort
        for(int place=1; max/place > 0; place*=10){
            countSort(arr,place);
        }
    }
    public static void main(String[] args) {
        int[] arr = {170,90,802,2,45,75};
        System.out.print("Original Array : ");
        printArray(arr);
        System.out.print("Array after Radix Sort :");
        radixSort(arr);
        printArray(arr);
    }
}
