package SortingAlgorithms.ProblemsOnSorting;


// An array of size N containing only 0's , 1's and 2's : sort the
// array in ascending order

public class ZeroOneTwoSorting {

    static void approach1(int[] arr){
        int count_0 = 0, count_1 = 0, count_2 = 0;
        for(int i : arr){
            if(i==0) count_0++;
            else if(i==1) count_1++;
            else count_2++;
        }

        int k=0;
        while (count_0 > 0){
            arr[k++] = 0;
            count_0 -- ;
        }
        while (count_1 > 0){
            arr[k++] = 1;
            count_1 -- ;
        }
        while (count_2 > 0){
            arr[k++] = 2;
            count_2 --;
        }

    }
    static void threePointerApproach(int[] arr){
        int low = 0, mid = 0, high = arr.length-1;
        while (mid<=high){
            if(arr[mid] == 0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(mid == 1){
                mid++ ;
            }
            else{
                swap(arr, mid, high);
                high-- ;
            }
        }
    }
    static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y] ;
        arr[y] = temp ;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0, 0};
//        System.out.println("Approach 1 :");
//        approach1(arr);

        System.out.println("Using three pointer approach :");
        threePointerApproach(arr);
        printArray(arr);

    }
}
