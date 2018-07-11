package dp.decorator;

public class BorderDecorator extends Decorator {

    BorderDecorator(View view) {
        super(view);
    }

    @Override
    public void draw() {
        super.draw();
        drawBorder(100);
    }

    public void drawBorder(int borderWidth) {
        System.out.println("Border width:" + borderWidth);
    }
}
