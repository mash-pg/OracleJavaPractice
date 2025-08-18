package test.test32;
interface A{}
//abstract class B implements A{}
class B implements A{}
class C extends B{}
class D extends C{}
class F {
	static int num;
	int asdf = 1;
	public int asdf() {
		return 2;
	}
	{
		System.out.println(4);
	}
	public F() {
		System.out.println(3);
		return;
	}
}
public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		F f = new F();
		System.out.println(f.asdf);
		System.out.println(f.asdf());
		m.calc(1,2.5);
		m.calc(1.6,3);
		System.out.println(f.num);
		//F.num;
		System.out.println(F.num);
		//m.calc(1,2);
		
	}
	private double calc(double a,int b) {
		return (a * b) /2;
	}

	private double calc(int a, double b) {
		return (a * b) /2;
	}
}
