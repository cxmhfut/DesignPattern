package dp.responsechain;

public class GeneralManager extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("General Manager:" + request);
    }
}
