package dp.factory;

public class PizzaConsumer {

    public Pizza orderPizza(String type) {
        return SimpleFactory.createPizza(type);
    }

}
