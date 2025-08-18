package test.test31;
interface A{}
//abstract class B implements A{}
class B implements A{}
class C extends B{}
class D extends C{}
public class Main {
	public static void main(String[] args) {
		A[] array  = {
				new B(),
				new B(),
				new B(),
				new B(),
				new B(),
				new C(),
				null,
				new D(),
				};
		B[] array1 = {new B(),new B(),new C()};
		//C[] array2 = {new B(),new C(),new D()};
		for(Object obj : array) {
			System.out.println(obj);			
		}
	}
}
