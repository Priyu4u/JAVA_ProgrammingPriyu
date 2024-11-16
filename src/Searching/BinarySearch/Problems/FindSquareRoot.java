package Searching.BinarySearch.Problems;

// Find the square root of the given non-negative value of x . Round it
// off to the nearest floor integer value

public class FindSquareRoot {
    static int sqrt(int x){
        int ans = -1;
        int st = 0, end = x;

        while (st<=end){
            int mid = st + (end-st)/2;
            int val = mid*mid;          // can use long here to avoid overflow
            if(val == x) return mid;
            else if(val > x) end = mid - 1;
            else{
                st = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 17;
        System.out.println("Square root(round off to nearest floor integer) : "+sqrt(x));
    }
}
