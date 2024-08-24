package Array.Questions.ArrayManipulation;
import java.util.Scanner;
public class FirstRepeatedValue {

    // Given an array consisting of integers . Return the first value
    // that is repeating in this array . If no value is being repeated
    // return -1

    static int firstRepeated(int[] arr){
        int n = arr.length;
        int ans  = -1;
        outer : for(int i=0; i<n-1 ; i++){
            for(int j=i+1; j<n ; j++){
                if(arr[i] == arr[j]){
                    ans = arr[i];
                    break outer;
                }
            }
        }
        return ans ;
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

        int ans = firstRepeated(arr);
        if(ans == -1){
            System.out.println("No repeated value exists");
        } else{
            System.out.println("First repeated value : "+ans);
        }


    }
}
