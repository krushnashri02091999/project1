package Arrays;

public class Find_Second_LargestElement_from_Array {
public static int findSecondLargest(int[] arr) {
	int first=Integer.MIN_VALUE;
	int second=Integer.MIN_VALUE;
	
	for (int num : arr) {
		if (num>first) {
			second=first;
			first=num;	
		} else if(num > second && num != first) {
second=num;
		}
	}
	return (second == Integer.MIN_VALUE) ? -1 :second;
}
public static void main(String[] args) {
	int[] arr= {12,35,1,10,34,1};
	int secondLargest = findSecondLargest(arr);
	System.out.println(secondLargest);
}
}
