package dp.template;

public class FootballGame extends Game{
    @Override
    protected void initialize() {
        System.out.println("Football Game:initialize...");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football Game:start...");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football Game:end...");
    }
}
