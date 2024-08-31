package Array2D;
import java.util.Scanner;
public class SpiralMatrixAntiClockwise {

    static void spiralMatrixAntiClockwise(int[][] arr, int r, int c){
        int n = r * c, count = 0;
        int topRow = 0, botRow = r-1, leftCol = 0, rightCol = c-1;
        while(count < n){

            // print left column
            for(int i = topRow; i<=botRow && count < n; i++){
                System.out.print(arr[i][leftCol] + " ");
                count++ ;
            }
            leftCol++ ;

            // print bottom row
            for(int i=leftCol; i<=rightCol && count < n; i++){
                System.out.print(arr[botRow][i] + " ");
                count++ ;
            }
            botRow--;

            // print right column
            for(int i=botRow; i>=topRow && count < n; i--){
                System.out.print(arr[i][rightCol] + " ");
                count++ ;
            }
            rightCol-- ;

            // print top row
            for(int i=rightCol; i>=leftCol && count < n; i--){
                System.out.print(arr[topRow][i]+ " ");
                count++ ;
            }
            topRow++ ;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();
        System.out.println("Enter elements of matrix :");
        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("After spiral printing in anti-clockwise direction :");
        spiralMatrixAntiClockwise(arr, r, c);

    }
}
