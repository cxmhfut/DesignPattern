package dp.factory;

public class CFactory implements Factory{
    @Override
    public Product create() {
        return new CProduct();
    }
}
