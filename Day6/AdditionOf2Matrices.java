import java.util.Scanner;

public class AdditionOf2Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and coloumn number of matrix 1 : ");
        System.out.println("Enter row Number : ");
        int r1 = sc.nextInt();
        System.out.println("Enter coloumn number : ");
        int c1 = sc.nextInt();
        int [] [] a1 = new int[r1][c1];
        System.out.println("Enter Matrix values");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter row and coloumn number of matrix 2 : ");
        System.out.println("Enter row Number : ");
        int r2 = sc.nextInt();
        System.out.println("Enter coloumn number : ");
        int c2 = sc.nextInt();
        int [] [] a2 = new int[r2][c2];
        System.out.println("Enter Matrix values");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                a2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1 : ");
        printMatrix(a1);
        System.out.println("Matrix 2 : ");
        printMatrix(a2);

        add(a1, r1, c1, a2, r2, c2);
 
    }

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int[][]a1,int r1, int c1, int[][] a2, int r2 ,int c2){
        if (r1!=r2 || c1!=c2) {
            System.out.println("Wrong Input");
            return;
        }
        int sum[][] = new int [r1][c1] ;
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a1[i][j]+ a2[i][j];
            }

        }
        System.out.println("sum of Matrix1 and Matrix2 : ");
        printMatrix(sum);
    
    }



}
