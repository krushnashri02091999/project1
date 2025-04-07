package Map_Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sort_Hashmap_by_Keys {
public static void main(String[] args) {
	HashMap<Integer, String> map=new HashMap<>();
	map.put(1, "Ram");
	map.put(5, "Sham");
	map.put(3, "Anand");
	map.put(2, "Hritik");
	map.put(4, "Abhi");
	
	Map<Integer, String> map1=new TreeMap<>(map);
	map1.forEach((key,value)->System.out.println(key +"  "+value));
//	System.out.println(map1);
}
}
