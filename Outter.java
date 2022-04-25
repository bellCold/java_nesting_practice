package nesting.se3;

public class Outter {
    String field = "Outter field";

    public void method() {
        System.out.println("Outter method");
    }

    class Inner {
        String field = "inner field";

        public void method() {
            System.out.println("inner method");
        }

        void print() {
            System.out.println(this.field);
            this.method();
            System.out.println(Outter.this.field);
            Outter.this.method();
        }
    }


}
