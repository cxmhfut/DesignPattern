package dp.responsechain;

public class HRManager extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getDay() <= 10) {
            System.out.println("HR Manager:" + request);
            return;
        }

        if (getSuccessor() != null) {
            getSuccessor().handleRequest(request);
        }
    }
}
