package test.test26;

class A {
    public void hello() {
        System.out.println("Hello A");
    }
}

class B extends A {
    @Override
    public void hello() {
        System.out.println("Hello B");
    }
}

class C extends B {
    @Override
    public void hello() {
        super.hello();
        System.out.println("Hello C");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new C();
        obj.hello();
    }
}
