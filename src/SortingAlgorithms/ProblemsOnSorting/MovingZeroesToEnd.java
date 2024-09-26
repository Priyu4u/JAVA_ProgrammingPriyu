package SortingAlgorithms.ProblemsOnSorting;

public class MovingZeroesToEnd {
    static void movingZeroes(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean flag = false;
            for(int j=i; j<n-i-1; j++){
                if(arr[j] == 0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 2, 7, 0};
        movingZeroes(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
}
