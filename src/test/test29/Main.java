package test.test29;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 11;
		int b= 0;
		while(a > 5) {
			if(5 < a) {
				System.out.println(b);
			}
			a--;
			b++;
		}
		int cnt = 0;
		while(cnt++ < 5)
			System.out.println("A");System.out.println("B");
			System.out.println("D");
		
		do
			System.out.println("a");
			//System.out.println("afd");
		while(cnt++ < 6);
		
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < 5; j++) {
				//System.out.println(i + j);
			}
		}
		
		int c = 1;
		
		for(int d = 2,total = 0; d<=5;d++) {
			total = c + d;
			//System.out.println(total);
		}
		//System.out.println(total);
		
		for(int k = 0, l = 0; k < 3 && l < 5; k++) {
			//System.out.println(k++);
			l++;
		}
		
		for(int n = 0; n < 5 ; n++, period(),superin(n),majikayo(n)) {
			//System.out.print(n);
		}
		
	}
	private static void period() {
		//System.out.print(",");
	}
	private static void superin(int ｎｄ) {
		//System.out.println("スーパーインクリメントだお！！" + (ｎｄ + 2));
	}
	private static void majikayo(int n) {
		//System.out.println(" (" + n + ") "  + "まじかよどんだけ関数入れられるん？？？");
	}

}
