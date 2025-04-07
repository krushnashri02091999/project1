package start;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sum_of_List_using_Stream {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,22,55,44,62,32,15,46,85,75,22);
	Optional<Integer> sum = list.stream().reduce((a,b)->(a+b));
	System.out.println(sum);
}
} 