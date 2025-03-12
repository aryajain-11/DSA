public class Day4_4 {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6};
        int multiply = 5;
        for (int i = 0; i < arr.length; i++) {
            multiply*=arr[i];
        }
        System.out.println("result is "+ multiply);

    }
}
