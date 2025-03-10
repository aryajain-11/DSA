public class MaxOfEleArray {
    public static void main(String[] args) {
        int arr[] = {5,6,4,2,8,1};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ans) {
                ans = arr[i]  ;
            }
           
        }
        System.out.println(ans);
    }
    
}
