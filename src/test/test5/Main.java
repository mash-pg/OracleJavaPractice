package test.test5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker a = new Engineer();
		Employee b = new Engineer();
		Engineer c = new Engineer();
		
		a.work();
		//a.report();
		//a.create();
		
		b.work();
		b.report();
		//b.create();
		
		c.work();
		c.report();
		c.create();
		
	}

}
