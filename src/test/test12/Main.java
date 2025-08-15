package test.test12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>(
				Arrays.asList(new String[]{"A","B","C","B","E"})
		);
		
		list.removeIf(
			(s)->{
				return s.equals("B");
	        }
		);
		System.out.println(list);
	}

}
