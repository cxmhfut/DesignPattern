package dp.builder;

public class Car2WheelBuilder extends CarBuilder {

    @Override
    public void buildEngine() {
        System.out.println("Building Engine...");
        getResult().setEngine("2WheelCarEngine");
    }

    @Override
    public void buildSteer() {
        System.out.println("Building Steer...");
        getResult().setSteer("2WheelCarSteer");
    }

    @Override
    public void buildWheel() {
        System.out.println("Building Wheel...");
        getResult().setWheel(2);
    }
}
