package SortingAlgorithms.ProblemsOnSorting;

public class TwoSwappedInSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, 5, 9, 10};


        if(arr.length <= 1){
            System.out.println("Array size is small for this operation");
            return;
        }
        int x = -1, y = -1;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] > arr[i]){
                if(x==-1){
                    x = i-1;
                    y = i;
                }
                else{
                    y = i;
                }
            }
        }

        // swap a[x] and a[y]
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp ;

        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();

    }
}
