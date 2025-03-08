import java.util.Scanner;

public class Day1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number ");
        int num2 = sc.nextInt();
        int addition = num2+num1;
        int substraction = num2-num1;
        System.out.println("Addition is " + addition);
        System.out.println("Substraction is "+ substraction);
        sc.close();
    }
    
}
