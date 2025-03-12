public class Lec2_6 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,5};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (ans<arr[i]) {
                ans = arr[i];
                
            }
        }
        System.out.println(ans);
    }
}
