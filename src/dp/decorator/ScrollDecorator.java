package dp.decorator;

public class ScrollDecorator extends Decorator {

    ScrollDecorator(View view) {
        super(view);
    }

    @Override
    public void draw() {
        super.draw();
        scrollTo(0);
    }

    public void scrollTo(int scrollPosition) {
        System.out.println("Scroll to:" + scrollPosition);
    }
}
