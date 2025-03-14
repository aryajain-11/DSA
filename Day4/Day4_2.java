public class Day4_2 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 25, 3}; 
        
        int min = numbers[0]; 
        int max = numbers[0]; 

        for (int num : numbers) {
            if (num < min) {
                min = num; 
            }
            if (num > max) {
                max = num; 
            }
        }

        System.out.println("Smallest Number: " + min);
        System.out.println("Largest Number: " + max);     
     }
}
