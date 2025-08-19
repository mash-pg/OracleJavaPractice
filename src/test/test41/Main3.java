package test.test41;

import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		//list.add(0,"D");
		//list.remove(0);
		for(Object obj : list) {
			//System.out.println(obj);
			if("C".equals(obj)) {
				list.remove(obj);
			}
		}
		
//		for(int i = 0; i< list.size();i++) {
//			//System.out.println(list.get(i));
//			if("B".equals(list.get(i))) {
//				list.remove(list.get(i));
//			}else {
//				System.out.println(list.get(i));
//			}
//		}
	}
}
