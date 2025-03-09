public class PatternA {
    public static void main(String[] args) {
        int n = 6;
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
