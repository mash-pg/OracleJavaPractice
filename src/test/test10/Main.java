package test.test10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service s = new Service();
		Algorithm algorithm = (name) -> {
			System.out.println("hello , " + name);
		};
		s.setLogic(algorithm);
		s.doProcess("Lanbda");
	}

}
