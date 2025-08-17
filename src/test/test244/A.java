package test.test244;

public interface A {
	public default void sample() {
		helper();
	}
	private void helper() {
		System.out.println("test");
	}
}
