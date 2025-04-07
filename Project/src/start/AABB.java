package start;

import java.util.Arrays;
import java.util.Scanner;

public class AABB {
public static void reverseNumber() {
	int n=123456;
	while (n>0) {
		int r=n%10;
		System.out.print(r);
		n=n/10;
	}
	System.out.println();
}
public static void countNumber() {
	int n=123456;
	int count=0;
	while (n>0) {
		n=n/10;
		count++;
	}
	System.out.println("Count is =  " +count);
}

public void bubbleSoft() {
	int[] arr= {1,5,9,8,7,4,2,3,6};
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = 0; j < arr.length-1; j++) {
			if (arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
}

public void sort() {
	int[] arr= {1,5,9,8,7,4,2,3,6};
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	int num = arr[1];
}
public void findKthValue(int k) {
	
	int[] arr= {1,5,9,8,7,4,2,3,6};
	Arrays.sort(arr);
	int num = arr[k];
	System.out.println(k +"th Value is = "+num);
}

public void rightShiftZero() {
	int[] arr= {0,5,0,8,0,4,0,3,6};
	int index=0;
	for (int num : arr)
		if (num!=0) 
	arr[index++]=num;
	while (index <arr.length) 
		arr[index++]=0;
	System.out.println(Arrays.toString(arr));
}

public void leftShiftZero() {
	int[] arr= {0,5,0,8,0,4,0,3,6};
	int index=arr.length-1;
	for (int i = arr.length-1; i >0; i--) 
		if (arr[i] !=0)
			arr[index--]=arr[i];
	while (index>=0) 
		arr[index--]=0;
	System.out.println(Arrays.toString(arr));
}

public void primeNumber() {
	int n=5;
	int count=0;
	for (int i = 1; i <= n; i++) {
		int a=n%i;
		if (a==0) {
			count++;
		}
	}
	System.out.println(count);
	if (count ==2) {
		System.out.println("Number is prime");
	} else {
		System.out.println("Number is Not prime");
	}
	
}
	public static void main(String[] args) {
		AABB a=new AABB();
		
		reverseNumber();
		countNumber();
		a.bubbleSoft();
		a.sort();
		System.out.println("Enter the Value");
		Scanner sc=new Scanner(System.in);
		int k = sc.nextInt();
		a.findKthValue(k);
		a.rightShiftZero();
		a.leftShiftZero();
		a.primeNumber();
	}
}
