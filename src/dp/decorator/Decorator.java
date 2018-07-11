package dp.decorator;

public class Decorator implements View {

    private View view;

    Decorator(View view) {
        this.view = view;
    }

    @Override
    public void draw() {
        view.draw();
    }
}
