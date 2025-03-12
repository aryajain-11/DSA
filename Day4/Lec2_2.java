public class Lec2_2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        boolean isInArray = false;
        int target = 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                isInArray = true;
                break; 
               
            }
    }
    if(isInArray){
        System.out.println("The value is present in the array");
    }
    else{
        System.out.println("The value is not present in the array");
    }
  }  
}
