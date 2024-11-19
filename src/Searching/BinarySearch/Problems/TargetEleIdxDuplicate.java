package Searching.BinarySearch.Problems;

// Search element in rotated sorted array with duplicate elements.
// Return true if element is found else return false
public class TargetEleIdxDuplicate {
    static boolean searchTarget(int[] arr, int target){
        int st = 0, end = arr.length - 1;
        while (st<=end){
            int mid = st + (end-st)/2 ;
            if(target == arr[mid]) return true ;
            if(arr[st] == arr[end] && arr[mid] == arr[end]){
                st++;
                end--;
            }
            else if(arr[mid] <= arr[end]){            // mid to end is sorted
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
        return false;

    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,2,0,0,0} ;
        int target = 2;
        System.out.println(searchTarget(arr,target));
    }
}
