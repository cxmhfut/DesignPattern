package dp.builder;

public abstract class CarBuilder implements Builder {
    Car car;

    CarBuilder() {
        car = new Car();
    }

    @Override
    public Car getResult() {
        return car;
    }
}
