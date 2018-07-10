package dp.factory;

public class SimpleFactory {

    public static Pizza createPizza(String type){
        Pizza pizza = null;
        switch (type) {
            case "cheease":
                pizza = new CheeasePizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            default:
                break;
        }

        return pizza;
    }
}
