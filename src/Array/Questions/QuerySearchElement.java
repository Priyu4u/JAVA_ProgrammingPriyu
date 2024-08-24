package Array.Questions;
import java.util.Scanner ;
public class QuerySearchElement {
    // Given Q queries, Check if the given number is present in array or not
    // Note: Value of all the elements in the array is less than 10 to
    // the power 5

    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005] ;

        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++ ;
        }
        return freq ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter number of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        System.out.print("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] freq = makeFrequencyArray(arr) ;

        System.out.print("Enter number of queries : ");
        int q = sc.nextInt();

        while (q > 0){
            System.out.print("Enter number to be searched : ");
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
            q-- ;
        }

    }
}
