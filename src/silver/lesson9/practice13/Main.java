package silver.lesson9.practice13;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		for(int i = 0; i < list.size();i++) {
			if("B".equals(list.get(i))) {
				list.remove(i);
			}
		}
		for(String str : list) {
			System.out.println(str);
		}

		
	}

}
