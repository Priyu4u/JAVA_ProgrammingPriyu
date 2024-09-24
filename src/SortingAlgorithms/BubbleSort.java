package SortingAlgorithms;

public class BubbleSort {
    static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean flag = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) return;
        }
        // Time Complexity(worst case) : O[n^2]
        // Time Complexity(average case) : O[n^2]
        // Time Complexity(best case) : O[n]
        // Space Complexity : O[1]
        // Bubble sort is a stable algorithm
        // Bubble sort is an in-place algorithm
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6};
        System.out.print("Original Array : ");
        printArray(arr);
        System.out.print("Array after sorting : ");
        bubbleSort(arr);
        printArray(arr);

    }
}
