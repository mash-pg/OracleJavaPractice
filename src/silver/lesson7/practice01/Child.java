package silver.lesson7.practice01;

public class Child extends Parent{
	Child(){
		name = "java";
	}
	
	void hello() {
		System.out.println("hello. " + name);
	}
}
