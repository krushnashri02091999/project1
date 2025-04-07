package start;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class List_Of_List_to_Simple_List_Conversion {
public static void main(String[] args) {
	List<List<String>> asList = Arrays.asList(
			Arrays.asList("John","Smith"),
			Arrays.asList("Trevis","Head"),
			Arrays.asList("Stark","Bolt"));
	System.out.println("List of List"+asList);
	
	List<String> collect = asList.stream().flatMap(List::stream).collect(Collectors.toList());
System.out.println("Simple List"+collect);

}
}
