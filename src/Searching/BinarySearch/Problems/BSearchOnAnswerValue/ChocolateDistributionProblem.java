package Searching.BinarySearch.Problems.BSearchOnAnswerValue;

public class ChocolateDistributionProblem {
    static boolean isDivisionPossible(int maxChocoAllowed, int[] a, int m){
        int numOfStudent = 1;
        int choco = 0;      // number of chocolates current student has
        for(int i=0; i<a.length; i++){
            if(a[i] > maxChocoAllowed) return false ;
            if(a[i]+choco <= maxChocoAllowed){
                choco += a[i];
            } else{
                numOfStudent++;
                choco = a[i];
            }
        }
        return numOfStudent <= m;
    }
    static int distributeChocolates(int[] a, int m){
        if(a.length < m) return -1;
        int ans = 0, st = 1, end = (int) 1e9;       // here 1e9 represents 10^9
        while (st<=end){
            int mid = st + (end-st)/2;
            if(isDivisionPossible(mid, a, m)){
                ans = mid;
                end = mid - 1;
            } else{
                st = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {5,3,1,4,2};
        int m = 3;          // no. of students
        System.out.println(distributeChocolates(a,m));
    }
}




// You have 'n'(n<=10^5)boxes of chocolate. Each box contains a[i](a[i]<=10000)
// chocolates. You need to distribute these boxes among 'm' students such
// that the maximum number of chocolates allocated to a student is minimum

// a. one box will be allocated to exactly one student
// b. all the boxes should be allocated
// c. each student has to be allocated at least one box
// d. allotment should be contiguous order, for instance, a student cannot be allocated
//    box 1 and box 3, skipping box 2

// Calculate and return the minimum possible number.
// Assume that it is always possible to distribute the chocolates
// The first line of input will contain the value of n, the number of boxes
// The second line of input will contain the n numbers denoting the number
// of chocolates in each box
// The third line will contain the m, number of students
