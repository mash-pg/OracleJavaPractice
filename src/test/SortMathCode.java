package test;

import java.util.Arrays;

public class SortMathCode implements SortMath{
	public  int[] sortMath() {
			int[] nums  = {5,3,8,1,2};
			Arrays.sort(nums);
			return nums;
	}
}
