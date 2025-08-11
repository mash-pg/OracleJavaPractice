package silver.lesson5.practice06;

public class Main {

	public static void main(String[] args) {
		int[] items = new int[3];
		items[0] = 100;
		items[1] = 200;
		items[2] = 300;
		System.out.println(items.length);
		int total = 0;
		for(int i =0; i < items.length; i++) {
			System.out.println(items[i]);
		}
	}

}
