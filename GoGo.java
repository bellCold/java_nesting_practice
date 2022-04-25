package nesting.se3;

public class GoGo {
    public static void main(String[] args) {
        Outter outter = new Outter();
        Outter.Inner inner = outter.new Inner();
        inner.print();
    }
}
