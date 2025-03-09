public class Lec2_14 {
    public static void main(String[] args) {
        //Diamond pattern
        int n =4;
        //upper half
        for (int i = 1; i <=n; i++) {
            //spaces 
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <=i; j++) {
                System.out.print("*");
            }
            //stars = 2*i-1 bhi kar sakte h ek hi loop chala kar  i se 2i-1 tak
            System.out.println();
        }
        //lower half

        for (int i = n; i >=1; i--) {
            //spaces 
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
