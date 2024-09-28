package SortingAlgorithms;

public class MergeSort {
    static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void merge(int[] arr, int l, int mid, int r){
        int n1 = mid - l + 1 , n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i,j,k;
        for(i=0; i<n1; i++) left[i] = arr[l+i];
        for(j=0; j<n2; j++) right[j] = arr[mid+1+j];
        i=0;
        j=0;
        k=l;
        while (i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            } else{
                arr[k++] = right[j++];
            }
        }

        while (i<n1) arr[k++] = left[i++];
        while(j<n2) arr[k++] = right[j++];
    }

    static void mergeSort(int[] arr, int l, int r){

        if(l>=r) return;
        int mid = (l+r)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);

        // Time Complexity : O[nlog(n)]
        // Space Complexity : O[n]
        // It is a stable algorithm
        // It is not an in-place algorithm
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6};
        System.out.print("Original Array : ");
        printArray(arr);
        System.out.print("Array after applying merge sort : ");
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
