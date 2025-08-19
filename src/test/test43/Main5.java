package test.test43;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		
		
		
		Sample s = new SubSample();
		System.out.println("親：");
		s.greeting();
		
		SubSample s1 = new SubSample();
		System.out.println("子供:");
		s1.greeting();
		s1.run();
		
		//キャストはできコンパイルができるけど実行はできない
		SubSample s2 =(SubSample) new Sample();
		s2.greeting();
		s2.run();
		
	}


}
