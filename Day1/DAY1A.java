import java.util.Scanner;

public class DAY1A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int substraction = num2-num1;
        int multiply = num2*num1;
    
        System.out.println("Substractions is " + substraction);
        System.out.println("Multiply  is " + multiply);
        try {
            int divide = num2/num1;
            System.out.println("Divide is " + divide);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        sc.close();
    }
}