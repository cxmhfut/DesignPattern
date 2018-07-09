package dp.builder;

public class Car2WheelBuilder extends CarBuilder {

    @Override
    public void buildEngine() {
        car.setEngine("2WheelCarEngine");
    }

    @Override
    public void buildSteer() {
        car.setSteer("2WheelCarSteer");
    }

    @Override
    public void buildWheel() {
        car.setWheel(2);
    }
}
