package Searching.BinarySearch.Problems;

// Given the rotated sorted array of integers, which contains distinct
// elements, and an integer target, return the index of target if it
// is in the array, else return -1
public class TargetEleIdx {
    static int searchTarget(int[] arr, int target){
        int n = arr.length;
        int st = 0, end = n - 1;
        while (st<=end){
            int mid = st + (end-st)/2 ;
            if(target == arr[mid]) return mid ;
            else if(arr[mid] < arr[end]){            // mid to end is sorted
                if(target > arr[mid] && target <= arr[end])
                    st = mid + 1;
                else
                    end = mid - 1;
            }
            else{                                      // st to mid is sorted
                if(target >= arr[st] && target < arr[mid])
                    end = mid - 1;
                else
                    st = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int target = 2;
        System.out.println(searchTarget(arr,target));
    }
}
