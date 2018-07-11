package dp.decorator;

public class Client {
    public static void main(String[] args) {
        View textview = new TextView();
        View scrollDecorator = new ScrollDecorator(textview);
        View borderDecorator = new BorderDecorator(scrollDecorator);
        borderDecorator.draw();
    }
}
