public class SelectionSort {
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minindex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minindex]>arr[j]) {
                    minindex= j;
                }

            }
            int temp = arr[minindex];
            arr[minindex]= arr[i];
            arr[i]= temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,5,4,1,3};
        for (int i = 0; i < arr.length; i++) {
            selectionSort(arr);
            System.out.println(arr[i]);
        }

    }
}

// time complexity o(n^2)
