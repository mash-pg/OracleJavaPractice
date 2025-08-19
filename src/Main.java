import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		String str;
		str = "初音ウホ";
		test(str);
	}
	
	private static void test(String str) {
		System.out.println(str);
		int s = (int) Math.round(Math.pow(1.1, 2));
		System.out.println(s);
	}
}
