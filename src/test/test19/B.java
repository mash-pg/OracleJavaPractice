package test.test19;

public class B extends A {
	private void print() {
		int a = 10;
		
		System.out.println("B");
	}
	
	public void b() {
		print();
	}
	public static void main(String... args) {
		B b = new B();		
		A a = new B();		
		a.a();
		b.print();
	}
}
