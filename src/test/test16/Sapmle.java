package test.test16;

public class Sapmle {
	
	int a;
	int b;
	int c;
	int d;
	
	//明示的でない
	void setA(int a) {
		a = a;
	}
	//明示的である
	void setB(int b) {
		this.b = b;
	}
	//明示的でない
	int setC(int c) {
		return c;
	}
	//明示的でない（numとdは違うから）
	int setD(int num) {
		d = num;
		return d;
	}
	
	void setAll(int x) {
		a = b = this.c = setD(x);
	}
	
	@Override
	public String toString() {

			return "Sample [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sapmle s = new Sapmle();
		s.setAll(10);
		System.out.println(s);
	}

}
