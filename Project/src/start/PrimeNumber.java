package start;

public class PrimeNumber {
public static void main(String[] args) {
	int n=6;
	int count=0;
	for (int i = 1; i <=n; i++) {
		int a=n%i;
		if (a==0) {
			count++;
		}
	}
	System.out.println(count);
	if (count==2) {
		System.out.println("Number is Prime");
	} else {
		System.out.println("Number is Not Prime");
	}
}

}
