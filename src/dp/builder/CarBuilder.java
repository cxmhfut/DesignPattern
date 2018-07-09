package dp.builder;

public abstract class CarBuilder implements Builder {
    Car car;

    CarBuilder() {
        car = new Car();
        buildEngine();
        buildSteer();
        buildWheel();
    }

    @Override
    public Car getResult() {
        return car;
    }
}
