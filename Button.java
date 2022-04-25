package nesting.se4;

public class Button {
    public static Button.OnClickListener OnClickListener;
    OnClickListener listener;

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }

    interface OnClickListener {
        void onClick();
    }
}

