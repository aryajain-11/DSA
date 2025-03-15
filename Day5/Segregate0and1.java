public class Segregate0and1 {
    public static void main(String[] args) {
       int arr[] = {0,1,1,0,0,0,1,1,0,1} ;
       Segregate0and1.seperate0s1sNumbers(arr);
    
       for(int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
       }

    }
    public static void seperate0s1sNumbers(int arr[]){
        if (arr.length<=1) {
            return ;
        }
        int left = 0;
        int right = arr.length-1;

        while (left<right) {
            while (arr[left]%2==0 && left<right) {
                left++;
            }
            while (arr[right]%2==1 && left<right) {
                right --;
            }

            if (left<right) {
                int x = arr[left];
                arr[left] = arr[right];
                arr[right] = x;

                left++;
                right--;
            }
        }


    }

}
