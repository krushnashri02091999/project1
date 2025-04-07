package List_Sorting_CoreJava;

import java.util.Arrays;
import java.util.List;

public class String_Sorting_Alphabetically {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Shri","Ram","Hari","Abhi","Rajveer");
		names.sort(String::compareTo);
		System.out.println(names);
	}
}
