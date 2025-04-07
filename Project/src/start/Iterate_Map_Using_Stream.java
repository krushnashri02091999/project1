package start;

import java.util.HashMap;
import java.util.Map;

public class Iterate_Map_Using_Stream {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<>();
	map.put("one", 1);
	map.put("two", 2);
	map.put("three",3);

	map.entrySet().stream()
	.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
}
}
