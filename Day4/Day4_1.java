public class Day4_1 {
    public static void main(String[] args) {
        int arr [] = { 1, 3, 5, 6,7,4};
        int multiply = 1;
        for (int i = 0; i < arr.length; i++) {
            multiply*=arr[i];
        }
        System.out.println("Multiplicatipn of array element " + multiply);

    }
}
