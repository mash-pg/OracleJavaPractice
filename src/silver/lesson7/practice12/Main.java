package silver.lesson7.practice12;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		//型を見ます。
		System.out.println(a.val);
		System.out.println(b.val);
		//メソッド処理を見ます。（Bにはメソッド処理がないのでAのprintメソッドを処理します。）
		a.print();
		b.print();

	}

}
