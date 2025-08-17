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
	}

}
