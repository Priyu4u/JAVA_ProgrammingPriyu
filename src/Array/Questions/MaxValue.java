package Array.Questions;

public class MaxValue {
    public static void main(String[] args) {
        int arr[] = {-5,-3,-23,-35,-52,-19,-86,0} ;
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum value : "+max);
    }
}
