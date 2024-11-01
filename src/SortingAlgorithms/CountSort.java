package SortingAlgorithms;

public class CountSort {
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static int findMax(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }

    static void basicCountSort(int[] arr){
        // Find the largest element of the array
        int max = findMax(arr);
        int[] frequency = new int[max+1];
        for(int i=0; i<arr.length; i++){
            frequency[arr[i]]++ ;
        }

        int k = 0;
        for(int i=0; i<frequency.length; i++){
            for(int j=0; j<frequency[i]; j++){
                arr[k] = i;
                k++;
            }
        }
    }

    static void stableCountSort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);             // finding largest element

        // making frequency array
        int[] frequency = new int[max+1];
        for(int i=0; i<arr.length; i++){
            frequency[arr[i]]++ ;
        }
        // make prefix sum array of frequency array
        for(int i=1; i< frequency.length; i++){
            frequency[i] += frequency[i-1];
        }

        // find the index of each element in original array and put it in the output array
        for(int i=n-1; i>=0; i--){
            int idx = frequency[arr[i]] - 1 ;
            output[idx] = arr[i];
            frequency[arr[i]]-- ;       // decrement after using once
        }

        // copy all elements of output to array
        for(int i=0; i<output.length; i++){
            arr[i] = output[i];
        }


        // Time complexity worst case: (n+k)   where k is range of numbers
        // Time complexity avg case : (n+k)   where k is range of numbers
        // Time complexity best case : (n)   where k is range of numbers

        // space complexity : (n+k)



    }


    public static void main(String[] args) {
        int[] arr = {5,2,8,1,3,3};
        System.out.print("Original Array : ");
        printArray(arr);
//        basicCountSort(arr);
//        System.out.print("Array after basic count sort : ");
//        printArray(arr);
        stableCountSort(arr);
        System.out.print("Array after stable count sort : ");
        printArray(arr);

    }
}
