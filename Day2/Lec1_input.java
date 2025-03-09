import java.util.Scanner;

public class Lec1_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name = sc.nextLine();
        System.out.println("Hello" + name + " here is  counting start ");
        for (int i = 0; i <=n; i++) {
            System.out.println(i);
        }

       // String name = sc.nextLine();
        //System.out.println("Hello" + name);
    }
}
