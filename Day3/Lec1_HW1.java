public class Lec1_HW1 {
    public static void main(String[] args) {
        //solid rhombus
        int n = 5;
        for (int i = 1; i <=n; i++) {
            //space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <=4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
