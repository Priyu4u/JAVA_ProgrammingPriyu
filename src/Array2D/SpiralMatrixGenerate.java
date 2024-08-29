package Array2D;
import java.util.Scanner;
public class SpiralMatrixGenerate {
    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void generateSpiralMatrix(int n){
        int[][] ans = new int[n][n] ;
        int topRow = 0, botRow = n-1, rightCol = n-1, leftCol = 0;
        int count = 1, tne = n * n;

        while(count <= tne){
            for(int i=leftCol; i<=rightCol && count<=tne; i++){
                ans[topRow][i] = count;
                count++;
            }
            topRow++;

            for(int i=topRow; i<=botRow && count<=tne; i++){
                ans[i][rightCol] = count;
                count++;
            }
            rightCol--;

            for(int i=rightCol; i>=leftCol && count<=tne; i--){
                ans[botRow][i] = count;
                count++;
            }
            botRow--;

            for(int i=botRow; i>=topRow && count<=tne; i--){
                ans[i][leftCol] = count;
                count++;
            }
            leftCol++;

        }
        printArray(ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        // Given a positive integer n, generate an n * n matrix filled
        // with elements from 1 to n^2 in spiral order

        System.out.print("Enter a positive integer : ");
        int n = sc.nextInt();

        generateSpiralMatrix(n);



    }
}
