public class Lec2_3 {
    public static void main(String[] args) {
        int arr[] = {90,80,85,84,95};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("The value of average marks is "+ sum/arr.length);
    }
}
