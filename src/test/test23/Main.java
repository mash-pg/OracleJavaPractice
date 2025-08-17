package test.test23;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		A a2 = new B();
		B b1 = new B();
		
		List<String> list = new ArrayList<>();
		
		a1.sample(list);
		a2.sample(list);
		b1.sample(list);
	}

}
