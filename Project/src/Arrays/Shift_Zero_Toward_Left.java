package Arrays;

import java.util.Arrays;

public class Shift_Zero_Toward_Left {
	public static void main(String[] args) {
		int[] arr = { 8, 9, 5, 6, 7, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int index = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--)
			if (arr[i] != 0)
				arr[index--] = arr[i];
		while (index >= 0)
			arr[index--] = 0;
		System.out.println(Arrays.toString(arr));
	}
}
