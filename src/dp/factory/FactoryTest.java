package dp.factory;

public class FactoryTest {
    public static void main(String[] args) {
        AFactory aFactory = new AFactory();
        Product productA = aFactory.create();
        BFactory bFactory = new BFactory();
        Product productB = bFactory.create();
        CFactory cFactory = new CFactory();
        Product productC = cFactory.create();
    }
}
