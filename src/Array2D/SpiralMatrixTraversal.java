package Array2D;
import java.util.Scanner;
public class SpiralMatrixTraversal {
    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void spiralMatrix(int[][] arr, int r, int c){
        int topRow = 0, botRow = r-1, rightCol = c-1, leftCol = 0;
        int count = 0, tne = r * c;
        while(count < tne){

            // printing top row
            for(int i=leftCol; i<=rightCol && count<tne; i++){
                System.out.print(arr[topRow][i]+" ");
                count++;
            }
            topRow++;

            // printing right column
            for(int i=topRow; i<=botRow && count<tne; i++){
                System.out.print(arr[i][rightCol]+" ");
                count++;
            }
            rightCol--;

            // printing bottom row
            for(int i=rightCol; i>=leftCol && count<tne; i--){
                System.out.print(arr[botRow][i]+" ");
                count++;
            }
            botRow--;

            // printing left column
            for(int i=botRow; i>=topRow && count<tne; i--){
                System.out.print(arr[i][leftCol]+" ");
                count++;
            }
            leftCol++;

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter number of rows in matrix: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns in matrix: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter elements of matrix :");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix :");
        printArray(arr);
        System.out.println("Spiral Printing :");
        spiralMatrix(arr, r, c);

    }
}
