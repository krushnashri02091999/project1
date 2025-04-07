package Star_Pattern;

public class Pyramid {
public static void main(String[] args) {
	int n=5;
	for (int i = 1; i <=n; i++) {
		for (int j = i; j < n; j++) {
			System.out.print(" ");
		}
		for (int j = i; j <=(2*i-1); j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
} 
}
