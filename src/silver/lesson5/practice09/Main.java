package silver.lesson5.practice09;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A[] array = {new C(),null,new D()};
		//A obj2 = array;
		//A[] obj1 = array;
		//Object obj = array;
		//Object[] objArray = array;
		for(Object s : array) {
			System.out.println(s.getClass());
		}
	}

}
