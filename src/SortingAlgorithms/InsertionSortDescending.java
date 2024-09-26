package SortingAlgorithms;

public class InsertionSortDescending {
    static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void insertionSortDescending(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int j=i;
            while (j>0 && arr[j] > arr[j-1]){       // change sign
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,7};
        System.out.print("Original Array : ");
        printArray(arr);
        System.out.print("Array after sorting(Descending Order) : ");
        insertionSortDescending(arr);
        printArray(arr);
    }
}
