package start;

public class String_Count_and_Reverse {
	public static void main(String[] args) {
		String s = "shrikrushna";
		StringBuffer sb=new StringBuffer(s);
		StringBuffer reverse = sb.reverse();
		int cnt = s.length();
		System.out.println(reverse);
		System.out.println(cnt);
	}
}
