package dp.builder;

public class Car4WheelBuilder extends CarBuilder{

    @Override
    public void buildEngine() {
        System.out.println("Building Engine...");
        car.setEngine("4WheelCarEngine");
    }

    @Override
    public void buildSteer() {
        System.out.println("Building Steer...");
        car.setSteer("4WheelCarSteer");
    }

    @Override
    public void buildWheel() {
        System.out.println("Building Wheel...");
        car.setWheel(4);
    }
}
