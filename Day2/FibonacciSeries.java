import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int j = 1;
        System.out.println(i);
        System.out.println(j);
        for (int k = 0; k <=n; k++) {
            int next = i+j;
            i = j;
            j = next;
            System.out.println(next);
        }
        sc.close();
    }
    
}
