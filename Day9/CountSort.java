import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {
    //Non comparision sorting algorithm
    // small nos

    public static void main(String[] args) {
        int [] arr = {6,3,10,9,2,4,9,7};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void countSort(int[] array){
        if (array==null|| array.length<=1) {
            return;
        }
        //largest no
        int max = array[0];
        for (int  num : array) {
            if (num>max) {
                max= num;
            }
            
        }

        //count array
       // arr = largest +1
        int[] countArray = new int[max+1];
        for (int num : array) {
            //frequency array
            countArray[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i]>0) {
                array[index] = i;
                index++;
                countArray[i]--;
                
            }
            
        }

        
    }


    // using hashmap
    public static void countSortHas(int[] arr) {
        if (arr==null || arr.length<=1) {
            return;
        }
        //shortcut to get maximum item
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer,Integer > countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num,countMap.getOrDefault(num,0)+1);

        }
       int index = 0;
       for(int i=min; i<=max; i++) {
         int count = countMap.getOrDefault(i, 0);
         for(int j=0; j < count; j++) {
           arr[index] = i;
           index++;
      }
    }
    }
}
