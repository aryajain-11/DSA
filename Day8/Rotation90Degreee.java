import java.util.Scanner;

public class Rotation90Degreee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix Row and Coloumn : ");
        System.out.println("Enter row Number : ");
        int r = sc.nextInt();
        System.out.println("Enter Coloumn number : ");
        int c = sc.nextInt();
        int [] [] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix : ");
        printMatrix(matrix);

        Rotation(matrix, n);

        System.out.println("Rotation of matrix ");
        printMatrix(matrix);
    }

    static void printMatrix(int[][]matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static void Rotation(int [][]matrix,int n){
        //transpose
        //reverse each row of transposed matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                //swap matrix[i][j] , matrix [j][i]
                int temp = matrix [i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            
        }
    }
}
