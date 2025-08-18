package test.test37;

public class Main implements A,B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().test();
		new Main().test1();
	}
	
	public void test() {
		A.super.test();
	}
	public void test1() {
		B.super.test();
	}
}
