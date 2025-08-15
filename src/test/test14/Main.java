package test.test14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(1, "E");
		
		System.out.println(map.size());
		
		map.forEach((key,value) -> System.out.println(key + " : " + value ));
		System.out.println();
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		};
		
		map.values().forEach(System.out::print);
	}

}
