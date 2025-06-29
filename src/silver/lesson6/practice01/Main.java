package silver.lesson6.practice01;


public class Main {
	public static void main(String[] args) {
	Item a = new Item();
	Item b = new Item();
	b.setNum(20);
	//aとbのそれぞれのインスタンスが独立しているのでaは何も代入されてない為１０になる
	System.out.println(a.getNum());
	//20になる
	System.out.println(b.getNum());
	}
}
