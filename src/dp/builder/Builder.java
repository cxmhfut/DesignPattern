package dp.builder;

public interface Builder {
    void buildEngine();

    Car getResult();

    void buildSteer();

    void buildWheel();
}
