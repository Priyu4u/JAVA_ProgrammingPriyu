package SortingAlgorithms;

public class QuickSort {
    static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr,int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int elementLessThanPivot = 0;
        for(int i=st+1; i<=end; i++){
            if(arr[i] <= pivot) elementLessThanPivot++ ;
        }
        int pivotIdx = st + elementLessThanPivot;
        swap(arr,pivotIdx,st);

        int i = st, j = end;
        while (i<pivotIdx && j>pivotIdx){
            while (i<pivotIdx && arr[i] <= pivot) i++;
            while (j>pivotIdx && arr[j] > pivot) j--;
            if(i<pivotIdx && j>pivotIdx){
                swap(arr,i,j);
                i++ ;
                j-- ;
            }
        }
        return pivotIdx;

    }

    static void quickSort(int[] arr,int st, int end){
        if(st >= end) return;
        int pivot = partition(arr,st,end);
        quickSort(arr,st,pivot-1);
        quickSort(arr,pivot+1,end);

        // Time Complexity(Avg Case) : O[nlog(n)]
        // Time Complexity(Best Case) : O[nlog(n)]
        // Time Complexity(Worst Case) : O[n^2]  -> can be avoided using randomized quick sort
        // Space Complexity : O[1](if implicit stack is considered)
        // Space Complexity : O[nlog(n)](if implicit stack is not considered)
        // It is an in-place algorithm
        // It is not a stable algorithm
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.print("Original Array : ");
        printArray(arr);
        System.out.print("Array after applying quick sort : ");
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
