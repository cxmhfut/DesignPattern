package dp.template;

public class BasketballGame extends Game{
    @Override
    protected void initialize() {
        System.out.println("Basketball Game:initialize...");
    }

    @Override
    protected void startPlay() {
        System.out.println("Basketball Game:start...");
    }

    @Override
    protected void endPlay() {
        System.out.println("Basketball Game:end...");
    }
}
