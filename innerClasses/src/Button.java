// Here we will demonstrate a local class
// which is a class that is declared inside the scope of a method
// and only has access to the fields in said method
public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        onClickListener.onClick(title);
    }

    // can declare an inner interface as well
    public interface  OnClickListener {
        void onClick(String title);
    }
}
