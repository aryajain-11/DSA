public class BubbleSort {
    public static void bubbleSort(int arr[]){
        //n-1 passes /iteration
        //i = 0 to n-2
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = false;//has any swapping happened
            for (int j = 0; j < arr.length-i-1; j++) {
                /*Last i element are already at correct sorted position so need to check them
                 */
                if (arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    flag = true;//some swaps happened
                }
            }
            if(flag==false){ //if(!flag)  have any swaps happened
                return;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] ={7,6,5,4,3};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}    
// time complexity o(n^2)