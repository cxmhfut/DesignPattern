package dp.factory;

public class BFactory implements Factory{
    @Override
    public Product create() {
        return new BProduct();
    }
}
