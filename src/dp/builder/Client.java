package dp.builder;

public class Client {
    public static void main(String[] args) {
        Builder builder2 = new Car2WheelBuilder();
        Builder builder4 = new Car4WheelBuilder();
        Director director = new Director();
        director.direct(builder2);
        director.direct(builder4);
        Car car2 = builder2.getResult();
        Car car4 = builder4.getResult();
        System.out.println(car2);
        System.out.println(car4);
    }
}
