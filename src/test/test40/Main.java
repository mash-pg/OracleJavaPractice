package test.test40;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new B();
		//アップキャスト
		A a = new B();
		a.hello();
		//ダウンキャスト
		A a1 = new B();
		B a2 = (B) a1;
		a1.hello();	
		//B b = (B) a;
	}

}
