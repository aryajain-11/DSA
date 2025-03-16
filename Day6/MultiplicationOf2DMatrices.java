import java.util.Scanner;

public class MultiplicationOf2DMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and coloumn of Matrix 1 : ");
        System.out.println("Enter row Number : ");
        int r1 = sc.nextInt();
        System.out.println("Enter coloumn Number ");
        int c1 = sc.nextInt();
        int [] [] a1 = new int[r1][c1];
        System.out.println("Enter matrix values : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter row and coloumn for matrix 2 : ");
        System.out.println("Enter row number ");
        int r2 = sc.nextInt();
        System.out.println("Enter Coloumn Number : ");
        int c2 = sc.nextInt();
        int [] [] a2 = new int[r2][c2];
        System.out.println("Enter matrix elements ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                a2 [i] [j] = sc.nextInt();
            }
            
        }

        System.out.println("Print matrix1 : ");
        printMatrix(a1);

        System.out.println("Print Matrix2 : ");
        printMatrix(a2);

        multiply(a1, r1, c1, a2, r2, c2);

        
    }

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int a1[][] , int r1, int c1, int a2 [][], int r2,int c2){
        if (c1!=r2) {
            System.out.println("Wrong Input ");
            return;
            
        }

        int multiply [] [] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
               for (int k = 0; k < c1; k++) {
                multiply[i][j] += (a1[i][k] * a2[k][j]);
               }
        }
    }
    System.out.println("Multiplication of Matrix1 and Matrix2 : ");
    printMatrix(multiply);
  }
}
