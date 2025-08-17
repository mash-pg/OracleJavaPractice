package test.test27;

class A {
    int num = 10;
    public String getName() {
        return "A";
    }
}

class B extends A {
    int num = 20;
    @Override
    public String getName() {
        return "B";
    }
}

class C extends B {
    @Override
    public String getName() {
        System.out.println(super.num);
        return super.getName();
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.getName());
    }
}

