package dp.builder;

public class Director {

    public void direct(Builder builder){
        builder.buildEngine();
        builder.buildSteer();
        builder.buildWheel();
    }

}
