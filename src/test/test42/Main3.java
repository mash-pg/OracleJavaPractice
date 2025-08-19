package test.test42;



public class Main3 {
	public static void main(String[] args) {
		int result = sample();
		System.out.println(result);
	}
	
	public static int sample() {
		try {
			throw new RuntimeException();
		}catch(RuntimeException e) {
			return 10;
		}finally {
			return 20;
		}
	}
}
