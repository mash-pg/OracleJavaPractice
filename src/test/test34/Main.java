package test.test34;

class Sample{
	//インスタンス化したいようにしたコンストラクタ
	private static int a = 1;
	static int b = 2;
	private Sample() {
		System.out.println("uhoho");
	}
	public static int uho() {
		return a;
	}
	//コンストラクタを受けってstaticで貰う方法。
	public static Sample getInstatnce() {
		return new Sample();
	}
}
public class Main {
	public static void main(String[] args) {
		//staticメソッドは、クラス名.メソッド（）で取得できる。
		Sample.getInstatnce();
		System.out.println(Sample.getInstatnce());
		System.out.println(Sample.uho());
		
		
	}
}
