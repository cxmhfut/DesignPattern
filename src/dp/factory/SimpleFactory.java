package dp.factory;

public class SimpleFactory {
    public Product create(String productName) {
        Product instance;
        switch (productName) {
            case "A":
                instance = new AProduct();
                break;
            case "B":
                instance = new BProduct();
                break;
            case "C":
                instance = new CProduct();
                break;
            default:
                throw new IllegalArgumentException();
        }

        return instance;
    }
}
