package Searching.BinarySearch.Problems;
//You are given an m x n integer matrix with the following two properties:
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.
//You must write a solution in O(log(m * n)) time complexity.
public class Search2DMatrix {
    static boolean searchMatrix(int[][] matrix, int target){
        int n = matrix.length, m = matrix[0].length;
        int st = 0, end = n*m-1;
        while (st<=end){
            int mid = st + (end-st)/2;
            int i = mid / m, j = mid % m;
            if(matrix[i][j] == target){
                return true;
            }
            else if(matrix[i][j] < target){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 7;
        System.out.println("Is "+target+" present in matrix : "+searchMatrix(a,target));
    }
}
