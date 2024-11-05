package SortingAlgorithms;

public class BucketSort {
    static void bucketSort(float[] arr){
        
    }
    public static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f} ;
        bucketSort(arr);
        for(float i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}





/*

    Basic Concept of Bucket Sort
    Step 1: Put all elements in b(let) number of buckets
    Step 2: Sort each bucket individually
            (we can use any other sorting algorithm for this)
    Step 3: Take out all elements and join them / merge them

 */
