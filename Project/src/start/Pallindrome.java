package start;

public class Pallindrome {
	public static void main(String[] args) {
		String s = "level";
		StringBuffer s1 = new StringBuffer(s);
		StringBuffer s2 = s1.reverse();
		if (s1.equals(s2) == true) {
			System.out.println("String is Pallindrome");
		} else {
			System.out.println("String is Not Pallindrome");
		}
	}
}
