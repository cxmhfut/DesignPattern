package dp.builder;

public class Car4WheelBuilder extends CarBuilder{

    @Override
    public void buildEngine() {
        car.setEngine("4WheelCarEngine");
    }

    @Override
    public void buildSteer() {
        car.setSteer("4WheelCarSteer");
    }

    @Override
    public void buildWheel() {
        car.setWheel(4);
    }
}
