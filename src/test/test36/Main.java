package test.test36;

class Sample{
	int num;
	public Sample(int num) {
		this.num = num;
	}
}
public class Main {
	public static void main(String[] args) {
		Sample s = new Sample(10);
		modify(s.num);
		System.out.println(s.num);
	}
	
	public static void modify(Integer num) {
		num *= 2;
	}
}
