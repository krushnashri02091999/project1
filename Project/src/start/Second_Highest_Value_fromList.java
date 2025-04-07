package start;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Second_Highest_Value_fromList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Optional<Integer> second = list.stream().distinct().sorted((a, b) -> (b - a)).skip(1).findFirst();
		System.out.println(second);
	}
}
