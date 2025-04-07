package List_Sorting_CoreJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingOf_of_String_Using_Length {
public static void main(String[] args) {
	List<String> list = Arrays.asList("Ram", "Prabhu","Abhi","Hritik");
	list.sort(Comparator.comparingInt(String::length));
	System.out.println(list);
}
}
