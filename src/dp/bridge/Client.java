package dp.bridge;

public class Client {
    public static void main(String[] args) {
        Circle redCircle = new Circle(5, 0, 0, new RedCircle());
        Circle greenCircle = new Circle(3, 0, 0, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
