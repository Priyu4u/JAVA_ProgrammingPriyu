package SortingAlgorithms;

public class InsertionSort {
    static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int j=i;
            while (j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        // Time Complexity(Best Case) : O[n]
        // Time Complexity(Worst Case) : O[n^2]
        // Time Complexity(Average Case) : O[n^2]
        // Space Complexity : O[1]
        // It is a stable algorithm
        // It is an in-place algorithm

    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,7};
        System.out.print("Original Array : ");
        printArray(arr);
        System.out.print("Array after sorting : ");
        insertionSort(arr);
        printArray(arr);
    }
}
