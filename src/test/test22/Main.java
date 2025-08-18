package test.test22;

import java.util.ArrayList;

abstract class Animal {
    public abstract void speak();
}

final class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("にゃー");
    }
}


class Dog extends Animal {
	@Override
	public void speak() {
		System.out.println("わんわん");
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 000001;
		var a = 1;
		System.out.println(c);
		var e = new ArrayList<>();
		
		Object b = new Object();
		String d = new String();
		Integer g = new Integer(1);
		int h = 1;
		System.out.println(g.equals(h));
		System.out.println(g == h);
		
		System.out.println();
		Object f = "test";
		System.out.println(b.equals(d));
		System.out.println(f.equals(b));
		System.out.println();
		
		ArrayList test = new ArrayList<>(3);
		ArrayList test1 = new ArrayList<String>(4);
		
		test.add("13gf");
		test1.add("13gf");
		
		
		System.out.println(test == test1);
		System.out.println(test.equals(test1));
		
		System.out.println();
		
		String i = new String("asdf");
		String j = new String("asdf");
		String k = "asdf";

		System.out.println(i.intern() == j);
		System.out.println(k.intern() == i);
		System.out.println(i.intern() == k);
		System.out.println();
		if(false)
			System.out.println("test");
		else
		System.out.println("uho");
		System.out.println();
		int num = 10;
		if(num < 10) {
			System.out.print("A");
		}else {
			System.out.print("B");
		}
		if(num == 10) {
			System.out.print("C");
		}
		
		
	}

}
