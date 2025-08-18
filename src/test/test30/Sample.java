package test.test30;

public class Sample {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] array = new int[3];	
//	Class clazz = array.getClass();
//	System.out.print(clazz.getCanonicalName());
//	System.out.println(array);
//	int a[]  =new int[2];
//	int[] b[] = new int[2][];
//	int[] c[] = new int[2][3];
//	int[][][] d= new int[3][][];
//	d[0][0][0] = 1;
//	d[1][0][0] = 1;
//	d[2][0][0] = 1;
//	d[3][0][0] = 1;

	
	Item[] items = new Item[3];
	Item2[] items2 =new Item2[3];
	Item item = new Item();
	Item2 item2 = new Item2();
	//items[0] = item.setPrice(100);
	items[0] = new Item();
	items2[1] = new Item2();
	
	String[][] test = {{"a","b"},null,{"c","d","e"}};
	System.out.println(test.length);
	
	
	}

		
}
