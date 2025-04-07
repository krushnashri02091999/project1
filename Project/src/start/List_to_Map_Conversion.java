package start;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class List_to_Map_Conversion {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Banana", "Grapes", "Dragan");
//		Map<String, String> map = list.stream().collect(Collectors.toMap(String::toLowerCase, Function.identity()));
		
		Map<Integer, String> map = IntStream.range(0, list.size())
				.boxed()
				.collect(Collectors.toMap(i -> i + 1, list::get));

		System.out.println(map);


}
}