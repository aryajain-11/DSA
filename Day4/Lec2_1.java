public class Lec2_1 {
    public static void main(String[] args) {
        float arr[] = {10.2f,1.2f,1.3f,1.2f,5.2f};
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            
        }
        System.out.println("The value of sum is " + sum);
    }
}
