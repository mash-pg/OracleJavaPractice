public class Sample{
	public void test(Object[] val) {
		System.out.println("A");
	}
	public void test(int[] val) {
		System.out.println("B");
	}
	public void test(int val) {
		System.out.println("F");
	}
	
	public void test(Object val) {
		System.out.println("C");
	}
		
}