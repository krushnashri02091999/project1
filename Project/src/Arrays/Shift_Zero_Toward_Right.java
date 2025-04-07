package Arrays;

import java.util.Arrays;

public class Shift_Zero_Toward_Right {
public static void main(String[] args) {
		int[] arr= {0,0,0,0,0,0,0,0,0,0,8,9};
	int index=0;
	for(int num:arr)
		if (num!=0)
			arr[index++]=num;
			while(index<arr.length)
				arr[index++]=0;
			System.out.println(Arrays.toString(arr));
}
}
