package silver.lesson6.practice17;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m.calc(2,3));
	}


	//受取が整数の引数の為エラーが出ます。
//	private double calc(int a, double b) {
//		return (a + b)/2;
//	}
//	
//	private double calc(double a, int b) {
//		return (a + b)/2;
//	}
	private double calc(int a, int b) {
		return (a + b)/2;
	}
	
	private double calc(double a, int b) {
		return (a + b)/2;
	}
}
