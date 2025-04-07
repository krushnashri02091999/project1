package Arrays_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Kth_Largest_Value {
	public static int kthValue(int[] arr, int k) {
		Arrays.sort(arr);
		int a=arr.length-k;
		int value = arr[a];
		return value;
	}
public static void main(String[] args) {
	int[] arr= {1,2,5,6,4,7,88,9,85,};
	Scanner sc=new Scanner(System.in);
	
	int k = sc.nextInt();
	System.out.println(kthValue(arr,k));

}
}
