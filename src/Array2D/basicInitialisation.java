package Array2D;
import java.util.Scanner;
public class basicInitialisation {

    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int[][] arr = new int[3][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[2][0] = 5;
        arr[2][1] = 6;

        // Initialisation using Literals
        int[][] arr2 = {{9,8,7}, {8,6,5}, {0,3,2}};

        System.out.println("Printing Array : ");
        printArray(arr);

        // Taking input from user
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();
        int[][] arr3 = new int[r][c];
        System.out.println("Enter array elements : ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr3[i][j] = sc.nextInt();
            }
        }
        System.out.println("You entered : ");
        printArray(arr3);

    }
}
