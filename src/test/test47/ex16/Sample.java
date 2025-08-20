package test.test47.ex16;

import java.util.*;

public class Sample {
	private void mian() {
		String[] array = {"A","B"};
		System.out.println(array[0].length());
		int i = 0;
		while (i < array.length) {
			int j = 0;
			do {
				++j;
			}while(j < array[i].length());
			System.out.println(array[i] + " : " + j);
			i++;
		}

	}
	
}
