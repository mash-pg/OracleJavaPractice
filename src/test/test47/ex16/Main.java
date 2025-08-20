package test.test47.ex16;

import java.util.Iterator;

public class Main{
	private int num;
	private int test() {
		for(int i = 0; i< 3;i++) {
			num += 1;
		}
		return num;
		
	}
	public static void main(String[] args) {
		Main m = new Main();
		int  num = m.test();
		m.test();
		System.out.println(m.num);
	}
}