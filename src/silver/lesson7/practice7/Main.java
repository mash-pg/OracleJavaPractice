package silver.lesson7.practice7;

public class Main implements A,B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().test();
		new Main().test1();
	}
	@Override
	public void test() {
		A.super.test();
	}
	@Override
	public void test1() {
		B.super.test1();
	}

}
