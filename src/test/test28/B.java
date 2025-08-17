package test.test28;

final class B implements A {
	public B(String str) {
		
	};
	@Override
	public B build(String str) {
		return new B(str);
	}

}
