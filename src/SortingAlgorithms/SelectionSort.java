package SortingAlgorithms;

public class SelectionSort {
    static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIdx = i;
            for(int j=i+1; j<n; j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        // Space Complexity : O[1]
        // Time Complexity(Best Case) : O[n^2]
        // Time Complexity(Average Case) : O[n^2]
        // Time Complexity(Worst Case) : O[n^2]
        // Selection sort is an unstable algorithm
        // Selection sort is an in-place algorithm
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,7};
        System.out.print("Original Array : ");
        printArray(arr);
        System.out.print("Array after sorting : ");
        selectionSort(arr);
        printArray(arr);
    }
}
