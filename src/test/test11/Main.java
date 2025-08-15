package test.test11;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item("D",100));
		list.add(new Item("B",200));
		list.add(new Item("C",300));
		list.add(new Item("A",100));
		list.remove(new Item("A",500));
		
		for(Item item : list) {
			System.out.println(item.getName());
		}
		

	}

}
