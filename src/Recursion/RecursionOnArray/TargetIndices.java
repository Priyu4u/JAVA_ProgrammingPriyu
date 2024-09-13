package Recursion.RecursionOnArray;

import java.util.ArrayList;

public class TargetIndices {

    static ArrayList<Integer> printIndicesAList(int[] arr,int n, int idx, int x){
        ArrayList<Integer> ans = new ArrayList<>();
        if(idx == n) return ans;       // empty arraylist

        if(arr[idx] == x){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns =  printIndicesAList(arr,n,idx+1,x);
        ans.addAll(smallAns);
        return ans;
    }
    static void printIndices(int[] arr,int n, int idx, int x){
        if(idx == n) return;
        if(arr[idx] == x){
            System.out.print(idx+" ");
        }
        printIndices(arr,n,idx+1,x);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,5};
        int x = 2;
        printIndices(arr,arr.length,0,x);
        System.out.println();
        System.out.println("Using arraylist : ");
        // using arraylist
        ArrayList<Integer> ans = printIndicesAList(arr,arr.length,0,x);
        System.out.println(ans);
    }
}
