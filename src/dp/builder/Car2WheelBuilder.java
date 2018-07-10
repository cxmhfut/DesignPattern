package dp.builder;

public class Car2WheelBuilder extends CarBuilder {

    @Override
    public void buildEngine() {
        System.out.println("Building Engine...");
        car.setEngine("2WheelCarEngine");
    }

    @Override
    public void buildSteer() {
        System.out.println("Building Steer...");
        car.setSteer("2WheelCarSteer");
    }

    @Override
    public void buildWheel() {
        System.out.println("Building Wheel...");
        car.setWheel(2);
    }
}
