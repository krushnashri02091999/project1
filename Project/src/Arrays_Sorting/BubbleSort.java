package Arrays_Sorting;

public class BubbleSort {
	
   static int[] arr= {10,25,36,89,45,62,32,15};
		   public void sort(int[] arr) {
			   int n=arr.length;
			   for (int i = 0; i < n-1; i++) {
				for (int j = 0; j < n-1; j++) {
					if (arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
		   }
   public static void main(String[] args) {
	BubbleSort b=new BubbleSort();
	b.sort(arr);
	for (int num : arr) {
		System.out.println(num);
	}
}
}
