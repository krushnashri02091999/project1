package List_Sorting_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Integer_Sorting {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(5,6,7,8,9,2,3,1,4);
	// Assending Order
	List<Integer> assending = list.stream().sorted().collect(Collectors.toList());
	System.out.println("Assending Order"+"  "+assending);
	
	// Decending Order
	List<Integer> dec = list.stream().sorted((a,b) -> (b-a)).collect(Collectors.toList());
System.out.println("Decending Order"+ "  "+dec);
}
}
