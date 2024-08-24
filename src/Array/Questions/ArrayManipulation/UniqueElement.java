package Array.Questions.ArrayManipulation;
import java.util.Scanner ;

public class UniqueElement {
    // Find the unique number in a given array where all the elements are being
    // repeated twice with one value being unique

    static int uniqueElement(int[] arr){
        int unique = -1;
        for(int i=0; i<arr.length-1; i++){
            boolean flag = false ;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    flag = true;
                }
            }
            if(flag == false){
                unique = arr[i] ;
                break;
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        System.out.print("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique Element : "+uniqueElement(arr));



    }
}
