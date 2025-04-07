package start;

public class ReverseNumber {
public static void main(String[] args) {
	int n=123456;
	while (n>0) {
		int r=n%10;
		System.out.print(r);
		n=n/10; 
		
	}
}
}
