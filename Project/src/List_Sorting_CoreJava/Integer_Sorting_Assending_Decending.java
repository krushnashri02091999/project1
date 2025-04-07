package List_Sorting_CoreJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Integer_Sorting_Assending_Decending {
public static void main(String[] args) {
	List<Integer> number = Arrays.asList(5,6,8,9,7,1,2,3,4);
	number.sort(Comparator.naturalOrder());
	for (Integer n : number) {
		System.out.println("Assending Order"+"    "+ n);
	}
	number.sort(Comparator.reverseOrder());
	for (Integer num : number) {
		System.out.println("Reverse Order"+"  "+num);
	}
}
}
