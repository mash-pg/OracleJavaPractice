package test.test41;

import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("test");
		list.add("test1");
		list.add(0,"test123");
		list.add(0,"test1234");
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}
