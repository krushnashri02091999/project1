package start;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class List_StartWith_Leter {
	public static void main(String[] args) {

		List<String> asList = Arrays.asList("John", "Smith", "Surya", "Holder", "James", "Henry");

		List<String> startwith = asList.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println(startwith);
	}
}
