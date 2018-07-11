package dp.strategy;

public class SuperMaket {

    private Strategy strategy;

    public SuperMaket(String season) {
        switch (season) {
            case "spring":
                strategy = new StrategySpring();
                break;
            case "summer":
                strategy = new StrategySummer();
                break;
            case "autumn":
                strategy = new StrategyAutumn();
                break;
            case "winter":
                strategy = new StrategyWinter();
                break;
            default:
                break;
        }
    }

    public void promote(){
        strategy.show();
    }
}
