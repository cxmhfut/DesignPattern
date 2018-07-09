package dp.builder;

public class Client {
    public static void main(String[] args) {
        Car car2 = (new Car2WheelBuilder()).getResult();
        Car car4 = (new Car4WheelBuilder()).getResult();

        System.out.println(car2);
        System.out.println(car4);
    }
}
