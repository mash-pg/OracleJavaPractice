package test.test43;

import java.util.ArrayList;

public class Main3 {
//	var i = 1;
//	void method (var n) {
//		
//	}
	public static void main(String[] args) {
		
//		var n;
		var s = "型推論も覚えれば簡単";
		
		var array = new ArrayList<>();
		array.add("なんでも入るぜ！");
		array.add(5);
		array.add(5.0);
		
		for(var i = 0; i < array.size();i++) {
			System.out.println(array.get(i));
		}
	}


}
