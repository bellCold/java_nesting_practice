package nesting.se4;

public class ButtonExample {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setListener(new Message());
        btn.touch();


        btn.setListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("익명구현이터페");
            }
        });

        btn.touch();

    }
}
