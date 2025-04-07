package Arrays;

import java.util.HashSet;

public class Check_Duplicate_Value {
	public static boolean duplcate(int[] arr) {
		HashSet<Integer> set=new HashSet<>();
		for (int num : arr) {
			if (set.contains(num)) 
				return true;
			set.add(num);
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,2};
		boolean duplcate = duplcate(arr);	
		System.out.println(duplcate);
	}
}
