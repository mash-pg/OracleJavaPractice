package test.test4;

public class B implements A {
	//元データ
	public void test() {
		A.super.sample();
	}
	//ここのデータ
	@Override
	public void sample() {
		System.out.println("test");
	}
	
}
