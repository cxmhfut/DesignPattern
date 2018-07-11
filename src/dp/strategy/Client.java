package dp.strategy;

public class Client {
    public static void main(String[] args) {
        SuperMaket superMaket = new SuperMaket("spring");
        superMaket.promote();
        superMaket = new SuperMaket("summer");
        superMaket.promote();
        superMaket = new SuperMaket("autumn");
        superMaket.promote();
        superMaket = new SuperMaket("winter");
        superMaket.promote();
    }
}
