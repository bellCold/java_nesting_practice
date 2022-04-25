package nesting.se1;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.field = 1;
        b.method();
        System.out.println("");

        A.C c = new A.C();
        c.field1 = 1;
        c.method1();
        A.C.field2 = 1;
        A.C.method2();
        System.out.println("");

        a.method();

    }
}
