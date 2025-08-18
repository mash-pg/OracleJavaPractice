package test.test33;

class Sample{
	static int num;
	static{
		num = 10;
		//System.out.println(num);
	};
	
	Sample(){
		num = 100;
		System.out.println(num);
	}
}
public class Main {
	public static void main(String[] args) {
		System.out.println(Sample.num);
		//Sample s = new Sample();
		
	}
}
