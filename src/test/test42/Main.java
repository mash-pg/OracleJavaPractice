package test.test42;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(1);
		list.add(null);
		list.add("");
		list.add("asdf");
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}
