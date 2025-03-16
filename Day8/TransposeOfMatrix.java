import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row number : ");
        int r = sc.nextInt();
        System.out.println("Enter Coloumn Number : ");
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];
        System.out.println("enter matrix Element : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix [i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix :  ");
        printMatrix(matrix);
        System.out.println("Transpose of matrix : ");
       int ans [] [] = Transpose(matrix, r, c);
       printMatrix(ans);
        

    }

    static void printMatrix(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int [][]Transpose(int matrix[][], int r , int c ){
       
        int ans[][] = new int[c][r];
        for ( int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
               
                ans[i][j] = matrix[j][i];
            }

        }
        return ans;
        
    }
    
}
