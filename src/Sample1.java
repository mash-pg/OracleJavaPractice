import java.util.Arrays;

public class Sample1 {

	public static void main(String[] args) {
		String[][] array = {{"A","B","C"}};
		int[] a  = new int[1];
		a[0] = 1;
		a[1] = 2;
		for(int i : a) {
			System.out.println("数字：" + i);
		}
		for(String[] str : array) {
			for(String str1 : str) {
				System.out.println(str1);
			}
		}
	}
}
