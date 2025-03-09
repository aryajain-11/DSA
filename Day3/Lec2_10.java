public class Lec2_10{
    public static void main(String[] args) {
        //Butterfly pattern 
        int n =4;
        //upper half
        for (int i=1; i <=n; i++) {
            //star
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i=n; i >=1; i--) {
            //star
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}