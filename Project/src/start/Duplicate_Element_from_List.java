package start;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate_Element_from_List {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,4,5,2,4);
	Set<Integer> set= new HashSet<>();
	List<Integer> duplicate= list.stream().filter(i->!set.add(i)).collect(Collectors.toList());	
System.out.println(duplicate);}
}
