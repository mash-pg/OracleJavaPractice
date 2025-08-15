package test.test13;

import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("A","B","C");
//		Consumer<String> logic = new Consumer<String>() {
//			//@Override
//			public void accept(String str) {
//				System.out.println(str);
//			}
//		};
//		Consumer<String> logic = (str) -> System.out.println(str);
//		list.forEach(logic);
		list.forEach(System.out::println);
	}

}
