package Arrays;

import java.util.Arrays;

public class ReverseArray {
	 public static void reverseArray(int[] array) {
	        int left = 0;
	        int right = array.length - 1;
	        
	        while (left < right) {
	            // Swap elements at left and right indices
	            int temp = array[left];
	            array[left] = array[right];
	            array[right] = temp;
	            
	            // Move towards the center
	            left++;
	            right--;
	        }
	    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 9, 5};
        System.out.println("Original Array: " + Arrays.toString(array));
        
        // Reverse the array
        reverseArray(array);
        
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

   
}

