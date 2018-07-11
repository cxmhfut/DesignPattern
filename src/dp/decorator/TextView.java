package dp.decorator;

public class TextView implements View {

    private String name = "TextView";

    @Override
    public void draw() {
        System.out.println("Draw:" + name);
    }
}
