class Sample{
	public Sample(int a){
		
	}
	protected Sample(String b){
		
	}
}

public class Main {
    public static void main(String... args) {

        // 文字列の比較
        String str1 = "String";
        String str2 = new String("String");
        String str3 = str1.intern();

        // str2は新しくインスタンスを生成しているので、str1と参照先は異なるのでfalse
        System.out.println("str1 == str2 : " + (str1 == str2));

        // 文字列の比較は同じ文字なので、equalsメソッドでの比較はtrue
        System.out.println("str1.equals(str2) : " + str1.equals(str2));

        // internメソッドは既にプールされている文字列を参照するためfalse
        System.out.println("str2 == str3 : " + (str2 == str3));

        // したがって、str1との比較ではtrue
        System.out.println("str1 == str3 : " + (str1 == str3));

        // もちろんequalsでの比較はtrue
        System.out.println("str2.equals(str3) : " + str2.equals(str3));
    }
}
