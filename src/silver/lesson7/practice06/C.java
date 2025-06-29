package silver.lesson7.practice06;

public class C implements A{
	@Override
	public void sample() {
		A.super.sample();
		System.out.println("Java");
	}
}


//public class C implements B{
//	@Override
//	public void sample() {
//		B.super.sample();
//		System.out.println("Java");
//	}
//}
