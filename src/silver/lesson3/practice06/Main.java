package silver.lesson3.practice06;

public class Main {

	public static void main(String[] args) {
        int i = 15;
        int a = 10;
        int b = 10;
    
        if(a > i || i  > ++b ) {
        	boolean result2 = a < i;
            boolean result3 = i > b;
            System.out.println(result2);
            System.out.println(result3);
        }
        
        System.out.println("b = " + b);
        

	}

}
