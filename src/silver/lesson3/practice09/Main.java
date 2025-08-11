package silver.lesson3.practice09;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample a = new Sample(10,"a");
		Sample b = new Sample(10,"b");
		//同値性
		System.out.println(a.equals(b));
		//同一性
		System.out.println(a == b);
	}

}
