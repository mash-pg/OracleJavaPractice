package test.test35;

class Sample{
	Sample(){
		System.out.println("引数なし");
	}
	Sample(String a){
		System.out.println("引数1個あり : ");
		System.out.println(a);
	}
	Sample(String a ,String b){
		System.out.println("引数2個あり : ");
		System.out.println(a + b);
	}
}
public class Main {
	public static void main(String[] args) {
		//staticメソッドは、クラス名.メソッド（）で取得できる。
		Sample s = new Sample();
		Sample s1 = new Sample("uho");
		Sample s2 = new Sample("uho","uho");
		
		
	}
}
