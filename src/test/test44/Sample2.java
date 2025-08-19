package test.test44;


class Sample2{
	private int num;
	private int test() {
		for(int i = 0; i< 3;i++) {
			num += 1;
		}
		
		return num;
	}
	public static void main(String[] args) {
	Sample2 s2 = new Sample2();
		int num = s2.test();
		s2.test();
		System.out.println(s2.num);
		
	}
}


