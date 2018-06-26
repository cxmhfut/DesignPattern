package dp.factory;

public class AFactory implements Factory{
    @Override
    public Product create() {
        return new AProduct();
    }
}
