package Arrays_Sorting;

import java.util.Arrays;

public class JavaBuildInSort {

	public static void main(String[] args) {
		int[] arr = { 12, 45, 69, 20, 13, 52, 64 };
		Arrays.sort(arr);
		for (int num : arr) {
			System.out.println(num);
		}
	}
}
