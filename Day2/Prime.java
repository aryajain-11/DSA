import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name = sc.nextLine();
        System.out.println(n );
        System.out.println(name);
        for (int i = 2; i <=n; i++) {
            if (n%i==0) {
                System.out.println(i);
                
            }
            
        }
    }
    
}
